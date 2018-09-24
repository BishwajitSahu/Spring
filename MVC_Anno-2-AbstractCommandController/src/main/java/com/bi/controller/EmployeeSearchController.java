package com.bi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.command.EmployeeCommand;
import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;
import com.bi.service.EmployeeService;

@Controller("empController")
public class EmployeeSearchController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/search.htm")
	public String searchEmployee(Map<String, List<EmployeeResultDTO>> map,@ModelAttribute EmployeeCommand cmd) {
		EmployeeDTO dto=null;
		List<EmployeeResultDTO> listRDTO=null;
		//convert Command object to dto object
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		listRDTO=service.getEmployeeList(dto);
		//put listRDTO to model data(map)
		map.put("listRDTO", listRDTO);
		return "result";
	}
	
}
