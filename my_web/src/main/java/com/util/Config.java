package com.util;

import java.util.ResourceBundle;


/**
 * 获取配置文件属性 
 * @author hongyong
 * @Description: 读取配置文件config.properties，文件放在src/main/resources
 * @date 2017年6月29日 下午7:38:56
 *
 */
public class Config {

	public static ResourceBundle bundle = ResourceBundle.getBundle("configs");
	
	//接收报文项目URL
	public static final String ACCEPT_DECLARE_HOST = "accept_declare_host";
	//接收报文项目URI
	public static final String ACCEPT_DECLARE_URI = "accept_declare_uri";
	
	
	public static String getString(String key){

		return bundle.containsKey(key) ? bundle.getString(key):"";
	}
	
	
	public static int getInt(String key){
		
		return bundle.containsKey(key) ? Integer.valueOf(bundle.getString(key)):0;
	}
}
