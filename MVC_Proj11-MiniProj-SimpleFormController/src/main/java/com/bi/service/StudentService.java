package com.bi.service;

import java.util.List;

import com.bi.bo.StudentBO;
import com.bi.dto.StudentDTO;

public interface StudentService {
	public List<StudentDTO> getStudents();
	public StudentDTO getStudentBySno(int sno);
}
