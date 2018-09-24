package com.bi.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bi.command.UserCommand;
import com.bi.dto.UserDTO;
import com.bi.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map) {
		UserCommand cmd=null;
		cmd=new UserCommand();
		cmd.setUser("raja");
		cmd.setPwd("rani");
		map.put("userCmd", cmd);
		return "login_form";
	}
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String authenticate(Map<String, Object> map,@ModelAttribute("userCmd")UserCommand cmd,BindingResult errors) {
		UserDTO dto=null;
		String result=null;
		//convert command to dto
		dto=new UserDTO();
		dto.setUser(cmd.getUser());
		dto.setPwd(cmd.getPwd());
		//invoke service method
		result=service.checkAuthentication(dto);
		map.put("result", result);
		System.out.println(result);
		return "login_form";
	}
}
