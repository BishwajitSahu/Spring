package com.bi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bi.service.WishService;

public class WishController extends AbstractController{
	private WishService service;
	
	public WishController(WishService service) {
	
		this.service = service;
	}
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		String msg=null;
		ModelAndView mav=null;
		//use WishServiceImpl class
		msg=service.generateWishMsg();
		//create ModelAndView object
		mav=new ModelAndView();
		//set view name to mav object
		mav.setViewName("result");
		//set attribute and object to mav object
		mav.addObject("wmsg",msg);
		//return mav object
		return mav;
		//return new ModelAndView("result","wmsg",msg);
	}
}
