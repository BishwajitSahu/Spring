package com.bi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.service.WishService;

@Controller("wishController")
public class WishController {
	@Autowired
	private WishService service;
	
	@RequestMapping("/wish.htm")
	public String wish(Map<String, String> map) {
		String msg=null;
		//use service
		msg=service.getWish();
		map.put("msg", msg);
		return "wish";
	}
}
