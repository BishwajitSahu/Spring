package com.bi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.bi.command.MyCommand;
import com.bi.dto.StudentDTO;
import com.bi.service.StudentService;

public class FormController extends SimpleFormController {
	private StudentService service;

	public FormController(StudentService service) {
		this.service = service;
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException be) throws Exception {
		StudentDTO dto=null;
		String msg=null;
		MyCommand cmd=null;
		ModelAndView mav=null;
		
		//type cast Object type command object to Specific Command object
		cmd=(MyCommand)command;
		//convert command object to dto object
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		msg=service.registerStudent(dto);
		//create mav object
		
		return new ModelAndView(getSuccessView(),"result",msg);
	}
}
