package com.bi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bi.command.StudentCommand;

public class MyMultiActionController extends MultiActionController {
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res,StudentCommand command) {
		return new ModelAndView("home", "msg", "add operation");
	}
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, StudentCommand command) {
		return new ModelAndView("home", "msg", "update operation");
	}
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res, StudentCommand command) {
		return new ModelAndView("home", "msg", "delete operation");
	}
	public ModelAndView view(HttpServletRequest req, HttpServletResponse res, StudentCommand command) {
		return new ModelAndView("home", "msg", "view operation");
	}
	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,StudentCommand command) {
		return new ModelAndView("home","msg","invalid operation");
	}
}
