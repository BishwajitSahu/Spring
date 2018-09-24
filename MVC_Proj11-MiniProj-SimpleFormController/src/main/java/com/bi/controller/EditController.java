package com.bi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.bi.command.StudentCommand;
import com.bi.dto.StudentDTO;
import com.bi.service.StudentService;

public class EditController extends SimpleFormController {

	private StudentService service;
	
	public EditController(StudentService service) {
		this.service = service;
	}

	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		StudentDTO dto=null;
		StudentCommand cmd=null;
		int sno = 0;
		// read input(sno)
		sno = Integer.parseInt(req.getParameter("sno"));
		//use service
		dto=service.getStudentBySno(sno);
		//convert dto to command object
		BeanUtils.copyProperties(dto, cmd);
		return cmd;
	}
}
