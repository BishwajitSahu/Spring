package com.bi.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class WishController extends AbstractController {
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Calendar cal=null;
		int hour=0;
		String msg=null;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			msg="good morning";
		else if(hour<16)
			msg="good afternoon";
		else if(hour<20)
			msg="good evening";
		else
			msg="good night";
		return new ModelAndView("wish","msg",msg);
	}

	
}
