package com.bi.dao;

import java.util.List;

import com.bi.bo.StudentBO;

public interface StudentDAO {
	public List<StudentBO> getAllStudents();
	public StudentBO getStudent(int sno);
}
