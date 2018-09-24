package com.bi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.dto.EmployeeDTO;
import com.bi.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/getEmps.htm")
	public String getEmps(Map<String,List<EmployeeDTO>> map) {
		List<EmployeeDTO> listDto=null;
		//use service
		listDto=service.getEmployees();
		
		map.put("listDto", listDto);
		return "result";
	}
}
