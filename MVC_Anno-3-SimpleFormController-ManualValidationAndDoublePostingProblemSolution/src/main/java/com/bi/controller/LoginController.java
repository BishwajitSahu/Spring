package com.bi.controller;

import java.util.Map;

import org.omg.CORBA.Request;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bi.command.UserCommand;
import com.bi.dto.LoginDTO;
import com.bi.service.LoginService;
import com.bi.validator.LoginValidator;

@Controller("loginController")
public class LoginController {
	
	@Autowired
	private LoginService service;
	@Autowired
	private LoginValidator validator;
	
	/*  Initial phase request hanlder method  */
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String, String> map,@ModelAttribute("userCmd") UserCommand cmd) {
		//setting initial data at form
		cmd.setUname("biswa");
		return "login";
	}
	
	/*  post back request handler method  */
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processForm(Map<String,String> map,@ModelAttribute("userCmd") UserCommand cmd,BindingResult errors) {
		LoginDTO dto=null;
		String result=null;
		
		//converting command object to dto object
		dto=new LoginDTO();
		BeanUtils.copyProperties(cmd, dto);
		System.out.println("LoginController.processForm()");
		
		if(cmd.getFlag().equalsIgnoreCase("no")) {
			//validator
			if(validator.supports(UserCommand.class)) {
				
				validator.validate(cmd, errors);
				if(errors.hasErrors()) {	
					return "login";
				}
			}
		}
		
		//use service
		result=service.verifyUser(dto);
		map.put("msg",result);
		return "login";
	}
	
	
}
