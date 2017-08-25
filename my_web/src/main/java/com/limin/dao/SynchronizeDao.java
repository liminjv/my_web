package com.limin.dao;

public class SynchronizeDao {

	private static String key = "abc";

	private String keys ;
	
	private Integer idInteger;
	
	public static String getKey() {
		return key;
	}

	public static void setKey(String key) {
		SynchronizeDao.key = key;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}
	public Integer getIdInteger() {
		return idInteger;
	}
	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	//静态 key
	public void keyMethod(String value){
		synchronized (key) {
			for(int i=0;i<5;i++){
				System.out.println("执行key="+key+",value="+value);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//非静态
	public void keysMethod(String value){
		synchronized (keys) {
			for(int i=0;i<5;i++){
				System.out.println("执行idInteger="+idInteger+",value="+value);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Integer
	public void idIntegerMethod(String value){
		synchronized (idInteger) {
			//用一个静态集合存放idInteger对象，保证一个值只有一个对象
			for(int i=0;i<5;i++){
				System.out.println("执行keys="+keys+",value="+value);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
