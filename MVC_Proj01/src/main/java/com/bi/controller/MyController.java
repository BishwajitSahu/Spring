package com.bi.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return new ModelAndView("result", "sysDate", new Date());
	}

}
