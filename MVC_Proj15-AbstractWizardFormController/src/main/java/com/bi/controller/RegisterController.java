package com.bi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.bi.command.EnquiryCommand;

public class RegisterController extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException Be) throws Exception {
		EnquiryCommand command=(EnquiryCommand)cmd;
		
		return new ModelAndView("result","res",cmd);
	}
	
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		return new ModelAndView("welcome");
	}

}
