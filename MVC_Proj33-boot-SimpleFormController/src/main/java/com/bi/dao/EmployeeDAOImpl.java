package com.bi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bi.bo.EmployeeBO;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private static String INSERT_QUERY="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int insertData(EmployeeBO bo) {
		int result=0;
		result=jt.update(INSERT_QUERY,bo.getEid(),bo.getFname(),bo.getLname(),bo.getSalary(),bo.getEmail());
		return result;
	}

}
