package com.bi.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.bi.bo.EmployeeResultBO;
import com.bi.command.EmployeeCommand;
import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;
import com.bi.service.EmployeeSearchService;
@Controller
public class EmployeeSearchController {
	@Autowired
	private EmployeeSearchService service;

	@RequestMapping("/commandController.htm")
	public String process(Map<String,Object> map,@ModelAttribute EmployeeCommand command) throws Exception {
		EmployeeDTO dto = null;
		List<EmployeeResultDTO> ldto = null;
		dto = new EmployeeDTO();
		// convert command class to dto
		dto.setEmpNo(command.getEmpNo());
		dto.seteName(command.geteName());
		dto.setJob(command.getJob());
		dto.setSal(command.getSal());
		// use service
		ldto = service.getEmployee(dto);

		// creat mav object
		map.put("empResult", ldto);
		return "result";
	}

}
