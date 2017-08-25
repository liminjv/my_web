package com.limin.dao;

import java.util.HashMap;

public class Synchronizes {

	private static HashMap<String, Integer> map = new HashMap<String, Integer>();

	
	/**
	 * 获取企业所对象
	 * @param entId
	 * @return
	 */
	public static Integer getEntSynchronize(Integer entId) {
		
		return map.get(String.valueOf(entId));
	}

	
	/**
	 * 添加企业锁对象
	 * @param entId
	 * @param ent_id
	 */
	public static void setEntSynchronize(Integer entId) {
		//集合中没有该企业的锁对象
		String entIdString = String.valueOf(entId);
		System.out.println("当前进入的参数："+entIdString);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(map.get(entIdString)==null){
			map.put(entIdString, entId);
			System.out.println("当前设置进map的参数："+entIdString);
		}
	}
	
	public static void removeAll() {
		map.clear();
	}
}
