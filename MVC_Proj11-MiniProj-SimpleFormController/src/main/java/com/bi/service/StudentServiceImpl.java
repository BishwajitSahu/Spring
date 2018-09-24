package com.bi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bi.bo.StudentBO;
import com.bi.dao.StudentDAO;
import com.bi.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	public List<StudentDTO> getStudents() {
		List<StudentDTO> listDTO = null;
		List<StudentBO> listBO = null;
		listDTO = new ArrayList<StudentDTO>();
		// use dao
		listBO = dao.getAllStudents();
		// convert listBO to listDTO
		if (listBO != null) {
			for (StudentBO bo : listBO) {
				StudentDTO dto = new StudentDTO();
				dto.setSno(bo.getSno());
				dto.setSname(bo.getSname());
				dto.setSadd(bo.getSadd());
				dto.setCourse(bo.getCourse());

				// add each dto to listDTO
				listDTO.add(dto);
			} // for
		} // if
		return listDTO;
	}// getStudents()

	public StudentDTO getStudentBySno(int sno) {
		StudentBO bo=null;
		StudentDTO dto=null;
		//use dao
		bo=dao.getStudent(sno);
		//convert bo to dto
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

}
