package com.bi.service;

import org.springframework.beans.BeanUtils;

import com.bi.bo.StudentBO;
import com.bi.dao.StudentDAO;
import com.bi.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	public String registerStudent(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//convert dto to bo
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insertStudent(bo);
		if(count==0) {
			return "Registration failed.";
		}
		else
			return "Registrantion succeded.";
	}

}
