package com.bi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.bi.bo.EmployeeResultBO;
import com.bi.command.EmployeeCommand;
import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;
import com.bi.service.EmployeeSearchService;

public class EmployeeSearchController extends AbstractCommandController {
	private EmployeeSearchService service;

	public EmployeeSearchController(EmployeeSearchService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException be)
			throws Exception {
		EmployeeDTO dto = null;
		List<EmployeeResultDTO> ldto = null;
		ModelAndView mav = null;
		EmployeeCommand command = (EmployeeCommand) cmd;
		dto = new EmployeeDTO();
		// convert command class to dto
		dto.setEmpNo(command.getEmpNo());
		dto.seteName(command.geteName());
		dto.setJob(command.getJob());
		dto.setSal(command.getSal());
		// use service
		ldto = service.getEmployee(dto);

		// creat mav object
		mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("empResult", ldto);
		return mav;
	}

}
