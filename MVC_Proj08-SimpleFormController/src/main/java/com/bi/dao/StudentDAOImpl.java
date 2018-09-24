package com.bi.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bi.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_QUERY = "INSERT INTO STUDENT VALUES(STUDENT_SNO.NEXTVAL,?,?,?)";
	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insertStudent(StudentBO bo) {
		int count = 0;
		count = jt.update(INSERT_QUERY, bo.getsName(), bo.getsAdd(), bo.getCourse());
		return count;
	}
}
