package com.limin.controller;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.limin.vo.ConcurrentMapVo;


@Controller
public class TestConcurrentMapController {
	
	private static ConcurrentHashMap<String,ConcurrentMapVo> currentmap = new ConcurrentHashMap<String,ConcurrentMapVo>();
	
	private static HashMap<String, ConcurrentMapVo> hashMap = new HashMap<String,ConcurrentMapVo>();
	
	
	@ResponseBody
	@RequestMapping("/limin/concurrentMap/init")
	public String initMap(HttpSession session){
		currentmap.put("abc", new ConcurrentMapVo("abc","lisi"));
		currentmap.put("def", new ConcurrentMapVo("def","zsan"));
		currentmap.put("ghj", new ConcurrentMapVo("ghj","liuyis"));
		currentmap.put("kl", new ConcurrentMapVo("kl","wangwu"));
		currentmap.put("xyz", new ConcurrentMapVo("xyz","xiaohong"));
		
		hashMap.put("abc", new ConcurrentMapVo("abc","lisi"));
		hashMap.put("def", new ConcurrentMapVo("def","zsan"));
		hashMap.put("ghj", new ConcurrentMapVo("ghj","liuyis"));
		hashMap.put("kl", new ConcurrentMapVo("kl","wangwu"));
		hashMap.put("xyz", new ConcurrentMapVo("xyz","xiaohong"));
		
		session.setAttribute("ids", 123456);
		return "success";
	}
	
	
	@RequestMapping("/limin/concurrentMap/index")
	public ModelAndView index(){
		currentmap.put("abc", new ConcurrentMapVo("abc","lisi"));
		currentmap.put("def", new ConcurrentMapVo("def","zsan"));
		currentmap.put("ghj", new ConcurrentMapVo("ghj","liuyis"));
		currentmap.put("kl", new ConcurrentMapVo("kl","wangwu"));
		currentmap.put("xyz", new ConcurrentMapVo("xyz","xiaohong"));
		
		hashMap.put("abc", new ConcurrentMapVo("abc","lisi"));
		hashMap.put("def", new ConcurrentMapVo("def","zsan"));
		hashMap.put("ghj", new ConcurrentMapVo("ghj","liuyis"));
		hashMap.put("kl", new ConcurrentMapVo("kl","wangwu"));
		hashMap.put("xyz", new ConcurrentMapVo("xyz","xiaohong"));
		return new ModelAndView("/test/concurrentMapIndex");
	}
	
	
	@ResponseBody
	@RequestMapping("/limin/concurrentMap/test1")
	public ModelMap testMap(String key,String name){
		ModelMap map = new ModelMap();
		
		ConcurrentMapVo vo = currentmap.get(key);
		if(vo!=null){
			//
			System.out.println("currentmap处理请求key="+key+",name="+name);
			try {
				Thread.sleep(0);
				currentmap.remove(key);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("currentmap请求离开key="+key+",name="+name);
			map.put("code", "success+currentmap");
		}else{
			//
			System.out.println("currentmap中没有对应参数，拒绝该请求key="+key+",name="+name);
			map.put("code", "error+currentmap");
		}
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping("/limin/concurrentMap/testHashMap")
	public ModelMap testHashMap(String key,String name){
		ModelMap map = new ModelMap();
		
		ConcurrentMapVo vo = hashMap.get(key);
		if(vo!=null){
			//
			System.out.println("hashMap处理请求key="+key+",name="+name);
			try {
				Thread.sleep(0);
				hashMap.remove(key);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hashMap请求离开key="+key+",name="+name);
			map.put("code", "success+hashMap");
		}else{
			//
			System.out.println("hashMap中没有对应参数，拒绝该请求key="+key+",name="+name);
			map.put("code", "error+hashMap");
		}
		return map;
	}
}
