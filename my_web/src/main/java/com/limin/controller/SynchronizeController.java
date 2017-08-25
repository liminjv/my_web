package com.limin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.limin.dao.SynchronizeDao;
import com.limin.dao.Synchronizes;


@Controller
public class SynchronizeController {

	
	@RequestMapping("/limin/synchronize/index")
	public ModelAndView index(){
		
		return new ModelAndView("/test/synchronize/index");
	}
	
	@ResponseBody
	@RequestMapping("/limin/synchronize/test1")
	public ModelMap testStaticValue(String key){
		System.out.println("请求进入："+key);
		SynchronizeDao dao = new SynchronizeDao();
		dao.keyMethod(key);
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/limin/synchronize/test2")
	public ModelMap testCommonValue(String keys,String value){
		System.out.println("请求进入："+keys);
		SynchronizeDao dao = new SynchronizeDao();
		dao.setKeys(value);
		dao.keysMethod(keys);
		System.out.println("-------qq="+keys+"-----");
		
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping("/limin/synchronize/test3")
	public ModelMap testInteger(String keys,Integer value){
		System.out.println("请求进入："+keys);
		SynchronizeDao dao = new SynchronizeDao();
		
		Synchronizes.setEntSynchronize(value);
		
		dao.setIdInteger(Synchronizes.getEntSynchronize(value));
		dao.idIntegerMethod(keys);
		System.out.println("-------qq="+keys+"-----");
		
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping("/limin/synchronize/test4")
	public ModelMap setSynchronize(Integer value){
		
		Synchronizes.setEntSynchronize(value);
		return null;
	}
	
}
