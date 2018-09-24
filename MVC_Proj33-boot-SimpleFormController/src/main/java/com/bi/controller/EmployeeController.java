package com.bi.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bi.command.EmployeCommand;
import com.bi.dto.EmployeeDTO;
import com.bi.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/form.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map,@ModelAttribute("empCmd") EmployeCommand cmd) {
		return "form";
	}
	
	@RequestMapping(value="/form.htm",method=RequestMethod.POST)
	public String submitForm(Map<String,Object> map,@ModelAttribute("empCmd") EmployeCommand cmd,BindingResult errors) {
		EmployeeDTO dto=null;
		int result=0;
		String msg=null;
		//convert command object to dto
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		result=service.registerEmp(dto);
		
		if(result==0) {
			msg="Record not inserted";
		}
		else {
			msg="Record inserted.";
		}
		map.put("result", msg);
		return "result";
	}
	
	
}
