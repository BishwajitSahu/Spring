package com.bi.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	@RequestMapping("/home")
	public String home(Map<String,Object> map) {
		return "home";
	}
	@RequestMapping("/address")
	public String address(Map<String,Object> map) {
		return "address";
	}
	
	@RequestMapping("/about")
	public String about(Map<String,Object> map) {
		return "about";
	}
}
