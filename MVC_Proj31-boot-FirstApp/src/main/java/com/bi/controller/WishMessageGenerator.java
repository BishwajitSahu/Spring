package com.bi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.service.WishMessageService;

@Controller
public class WishMessageGenerator {
	@Autowired
	private WishMessageService service;

	@RequestMapping("/wish.htm")
	public String getMessage(Map<String, Object> map) {
		String result=service.msg();
		map.put("result", result);
		return "result";
	}
}
