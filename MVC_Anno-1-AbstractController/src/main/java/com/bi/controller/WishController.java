package com.bi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.service.WishService;

@Controller
public class WishController{

	@Autowired
	WishService service;
	
	@RequestMapping(value="/wish.htm")
	public String process(Map<String, String> map){
		String wMsg=null;
		//use service
		wMsg=service.getWish();
		map.put("msg",wMsg);
		return "result";
	}

}
