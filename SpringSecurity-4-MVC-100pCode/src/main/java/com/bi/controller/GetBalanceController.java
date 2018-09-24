package com.bi.controller;

import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class GetBalanceController {

	@RequestMapping("/getBal.htm")
	public String getBal(Map<String,Object> map) throws Exception {
		map.put("bal",new Random().nextInt(10000));
		return "balance";
	}
	@RequestMapping("/home.htm")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/access_denie.htm")
	public String accessDenie() {
		return "access_denied";
	}
	@RequestMapping("/max_session.htm")
	public String maxSession() {
		return "max_session";
	}
	@RequestMapping("/login.htm")
	public String loginForm() {
		return "login";
	}
}
