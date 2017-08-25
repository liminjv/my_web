package com.limin.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.limin.http.TransFile;
import com.limin.util.DbTools;
import com.util.Config;


@Controller
public class DemoController {

	
	private final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@ResponseBody
	@RequestMapping("/test")
	public String Test(){
		
		return Config.getString(Config.ACCEPT_DECLARE_HOST);
	}
	
	
	@ResponseBody
	@RequestMapping("/test/httpFile")
	public ModelMap httpFile(TransFile file,HttpServletRequest request){
		Map<String, String[]> map2 = request.getParameterMap();
		if(map2!=null&&!map2.isEmpty()){
			for(Entry<String, String[]> entry:map2.entrySet()){
				System.out.println(entry.getKey()+" : "+Arrays.toString(entry.getValue()));
			}
		}
		ModelMap map = new ModelMap();
		if(file!=null){
    		map.put("name", file.getFileName());
    		map.put("content", file.getContent());
    	}
		map.put("code", "success");
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping("/test1")
	public ModelMap Test1(){
		ModelMap map = new ModelMap();
		
		map.put("hw","历史的");
		map.put("hsd","sf地方地方的豆腐干热风历史的");
		return map;
	}
	
	@RequestMapping("/")
	public ModelAndView index(){
		
		return new ModelAndView("index");
	}
	
	
	@ResponseBody
	@RequestMapping("/test/dnf")
	public ModelMap testMysql(){
		ModelMap map = new ModelMap();
		map.put("sss", "就放假了的");
		List<HashMap<String,Object>> list = null;
		String sql = "select * from ent_user where user_name='guangxin' ";
		try {
			list = DbTools.executeQueryPS(sql, new ArrayList<Object>());
		} catch (SQLException e) {
			logger.error("testMysql", e);
		}
		map.put("result", list);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/test/json/{h}")
	public ModelMap testJsonString(@RequestBody User user,@PathVariable("h")String h){
		ModelMap map = new ModelMap();
		map.put("user", user);
		map.put("h", h);
		return map;
	}
}
