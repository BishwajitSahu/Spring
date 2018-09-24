package com.bi.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bi.service.WishService;

@Controller
public class WishController {
	public WishService service;
	
	public WishController(WishService service) {
		this.service = service;
	}
	/*@RequestMapping("/wish.htm")
	public ModelAndView process() {
		String wMsg=null;
		//use service
		wMsg=service.generateMsg();
		return new ModelAndView("result","msg",wMsg);
	}*/
/*	@RequestMapping("/wish.htm")
	public String process(Model model) {
		String wMsg=null;
		wMsg=service.generateMsg();
		model.addAttribute("msg",wMsg);
		return "result";
	}*/
	/*@RequestMapping("/wish.htm")
	public String process(ModelMap map) {
		String wMsg=null;
		wMsg=service.generateMsg();
		map.addAttribute("msg",wMsg);
		return "result";
	}*/
	
	//Best Approach
	@RequestMapping("/wish.htm")
	public String process(Map<String, Object> map) {
		String wMsg=null;
		wMsg=service.generateMsg();
		map.put("msg",wMsg);
		return "result";
	}
	
	/*@RequestMapping("/wish.htm")
	public void process(Map<String, Object> map) {
		String wMsg=null;
		wMsg=service.generateMsg();
		map.put("msg",wMsg);
		
	}*/
}
