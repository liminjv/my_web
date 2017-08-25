package com.demo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;



public class JsonValueTool {
    @Test
    public void test() {
        String originString = "{\n" +
                "  \"student\": [\n" +
                "    {\n" +
                "      \"name\": \"jack\", \n" +
                "      \"age\": 25, \n" +
                "      \"education\": {\n" +
                "        \"education1\": \"Harvard University\", \n" +
                "        \"education2\": \"University of Cambridge\", \n" +
                "        \"education3\": \"Massachusetts Institue of Technology\"\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        JSONObject originObject = JSONObject.parseObject(originString);
        System.out.println(JsonValueTool.getValueByKeyExpression(originObject, "student", "student#education#education2"));
    }

    public static Object getValueByKeyExpression(Object originObject, String startKey, String targetKeyExpression) {
        if (StringUtils.isBlank(startKey)) {
            return originObject;
        }
        if (originObject instanceof JSONObject) {
            return getValueFromJSONObjectByKeyExpression((JSONObject) originObject, startKey, targetKeyExpression);
        }
        if (originObject instanceof JSONArray) {
            return getValueFromJSONArrayByKeyExpression((JSONArray) originObject, startKey, targetKeyExpression);
        }
        return null;
    }

    private static String getNextKey(String startKey, String targetKeyExpression) {
        if (StringUtils.isBlank(targetKeyExpression)) {
            return null;
        }

        String[] keys = targetKeyExpression.split("#");
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(startKey) && (i < keys.length - 1)) {
                return keys[i + 1];
            }
        }
        return null;
    }

    private static Object getValueFromJSONArrayByKeyExpression(JSONArray originObject, String startKey, String targetKeyExpression) {
        for (int j = 0; j < originObject.size(); j++) {
            JSONObject jsonObject = originObject.getJSONObject(j);
            Object targetObject = getValueFromJSONObjectByKeyExpression(jsonObject, startKey, targetKeyExpression);
            if (targetObject != null) {
                return targetObject;
            }
        }
        return null;
    }

    private static Object getValueFromJSONObjectByKeyExpression(JSONObject originObject, String startKey, String targetKeyExpression) {
        Object object = originObject.get(startKey);
        return object != null ? getValueByKeyExpression(object, getNextKey(startKey, targetKeyExpression), targetKeyExpression) : null;
    }
}