package com.bi.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bi.command.UserCommand;
import com.bi.dto.LoginDTO;
import com.bi.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm() {
		return "login_form";
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String loginProcess(Map<String,String> map,@ModelAttribute("userCmd") UserCommand cmd) {
		LoginDTO dto=null;
		String result=null;
		//convert command object to dto
		dto=new LoginDTO();
		BeanUtils.copyProperties(cmd, dto);
		
		//use service
		result=service.validateUser(dto);
		//put model data
		map.put("resultMsg",result);
		//return result page
		return "result";
	}
}
