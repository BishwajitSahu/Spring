package com.bi.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("homeController")
public class HomeController {
	@RequestMapping("/home.htm")
	public String showHome(Map<String,Object> map) {
		map.put("time",new Date());
		return "home";
	}
}
