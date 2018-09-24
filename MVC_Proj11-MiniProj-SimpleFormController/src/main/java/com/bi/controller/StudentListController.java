package com.bi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bi.dto.StudentDTO;
import com.bi.service.StudentService;

public class StudentListController extends AbstractController {
	private StudentService service;
	public StudentListController(StudentService service) {
		this.service=service;
	}
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<StudentDTO> listDTO=null;
		ModelAndView mav=null;
		//use service
		listDTO=service.getStudents();
		return new ModelAndView("student_list","student_list",listDTO);
	}

}
