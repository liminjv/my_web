package com.xmls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.StringUtils;

public class JaxbReadXml {

    @SuppressWarnings("unchecked")
    public static <T> T readString(Class<T> clazz, String context) throws JAXBException {
        try {
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller u = jc.createUnmarshaller();
            return (T) u.unmarshal(new File(context));
        } catch (JAXBException e) {
            // logger.trace(e);
            throw e;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T readConfig(Class<T> clazz, String config, Object... arguments) throws IOException,
            JAXBException {
        InputStream is = null;
        try {
            if (arguments.length > 0) {
                config = MessageFormat.format(config, arguments);
            }
            // logger.trace("read configFileName=" + config);
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller u = jc.createUnmarshaller();
            is = new FileInputStream(config);
            return (T) u.unmarshal(is);
        } catch (IOException e) {
            // logger.trace(config, e);
            throw e;
        } catch (JAXBException e) {
            // logger.trace(config, e);
            throw e;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T readConfigFromStream(Class<T> clazz, InputStream dataStream) throws JAXBException {
        try {
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller u = jc.createUnmarshaller();
            return (T) u.unmarshal(dataStream);
        } catch (JAXBException e) {
            // logger.trace(e);
            throw e;
        }
    }

    public static void main(String[] args) throws JAXBException {
//        TestOrgs testOrgs = JaxbReadXml.readString(TestOrgs.class, "xml/test.xml");
//        System.out.println(testOrgs.getSize());
//        System.out.println(testOrgs.getBatchNumber());
//        System.out.println(testOrgs.getErrmsg());
//        for (TestOrg o : testOrgs) {
//            System.out.println(o.getOrgName());
//        }
    	JianCeShuJu model = JaxbReadXml.readString(JianCeShuJu.class, "xml/Base61825.xml");
//    	TestDate model = JaxbReadXml.readString(TestDate.class, "xml/DateTest.xml");
    	
    	System.out.println(model);
    	Field[] fields = model.getClass().getDeclaredFields();
    	for(Field field:fields){
    		String value = getParamValue(model, field);                
    		if(StringUtils.isNotBlank(value)){
    			System.out.println("属性名："+field.getName()+";属性值："+value);
    		}
    	}
    }

	private static String getParamValue(Object model, Field field) {
		String name = field.getName();
		name = name.substring(0,1).toUpperCase()+name.substring(1);
		String type = field.getGenericType().toString();
		 try {
			if(type.equals("class java.lang.String")){   //如果type是类类型，则前面包含"class "，后面跟类名
			     Method m = model.getClass().getMethod("get"+name);
			     String value = (String) m.invoke(model);    //调用getter方法获取属性值
			     if(value != null){
			         return value;
			     }
			 }
			 if(type.equals("class java.lang.Integer")){     
			     Method m = model.getClass().getMethod("get"+name);
			     Integer value = (Integer) m.invoke(model);
			     if(value != null){
			         return value.toString();
			     }
			 }
			 if(type.equals("class java.math.BigDecimal")){     
			     Method m = model.getClass().getMethod("get"+name);
			     BigDecimal value = (BigDecimal) m.invoke(model);
			     if(value != null){                    
			         return value.toString();
			     }
			 }                  
			 if(type.equals("class java.lang.Boolean")){
			     Method m = model.getClass().getMethod("get"+name);    
			     Boolean value = (Boolean) m.invoke(model);
			     if(value != null){                      
			         return value+"";
			     }
			 }
			 if(type.equals("class java.util.Date")){
			     Method m = model.getClass().getMethod("get"+name);                    
			     Date value = (Date) m.invoke(model);
			     if(value != null){
			         return value.toLocaleString();
			     }
			 }
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		 return null;
	}
}