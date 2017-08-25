package com.limin.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class JsonToBean {

	
	public static void main(String[] args) {
		
		OneBean oneBean = new OneBean();
		
		List<TwoBean> list = new ArrayList<TwoBean>();
		for(int i=0;i<5;i++){
			TwoBean bean = new TwoBean();
			bean.setB(i);
			bean.settName("twoBean"+i+"名字");
			list.add(bean);
		}
		oneBean.setA(12345);
		oneBean.setName("onebean名字");
		oneBean.setList(list);
		String string = JSON.toJSONString(oneBean);
		System.out.println("json字符串："+string);
		
		OneBean parseObject = JSON.parseObject(string, OneBean.class);
		System.out.println(parseObject);
		List<TwoBean> list2 = parseObject.getList();
		for(TwoBean bean:list2){
			System.out.println(bean);
		}
	}
}
