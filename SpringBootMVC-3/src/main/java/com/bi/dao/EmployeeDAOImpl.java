package com.bi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bi.bo.EmployeeBO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_ALL_EMPS="SELECT EID,FNAME,LNAME,SALARY,EMAIL FROM EMPLOYEE";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<EmployeeBO> getEmployees() {
		List<EmployeeBO> listBo=null;
		listBo=(List<EmployeeBO>)jt.query(GET_ALL_EMPS, new EmployeeRowMapper());
		
		return listBo;
	}
	
	class EmployeeRowMapper implements RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBO bo=null;
			bo=new EmployeeBO();
				bo.setEid(rs.getInt(1));
				bo.setFname(rs.getString(2));
				bo.setLname(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				bo.setEmail(rs.getString(5));
			
			return bo;
		}
		
	}
}
