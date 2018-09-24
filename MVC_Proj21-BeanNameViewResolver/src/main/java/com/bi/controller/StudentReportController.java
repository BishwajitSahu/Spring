package com.bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bi.dto.StudentDTO;

public class StudentReportController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//talk to service dao and collect the data from the db table
		StudentDTO stud1=null,stud2=null;
		List<StudentDTO> listDto=null;
		//create student1 object
		stud1=new StudentDTO();
		stud1.setSno(101);
		stud1.setSname("biswa");
		stud1.setCourse("java");
		//create student2 object
		stud2=new StudentDTO();
		stud2.setSno(102);
		stud2.setSname("dibya");
		stud2.setCourse(".net");
		//create list object
		listDto=new ArrayList<>();
		//add student objects to list object
		listDto.add(stud1);
		listDto.add(stud2);
		if(req.getParameter("type").equals("pdf")) {
			return new ModelAndView("report_pdf","report",listDto);
		}
		else
			return new ModelAndView("report_excel","report",listDto);
	}
}
