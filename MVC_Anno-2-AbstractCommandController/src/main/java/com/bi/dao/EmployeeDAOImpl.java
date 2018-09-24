package com.bi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.bi.bo.EmployeeBO;
import com.bi.bo.EmployeeResultBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private final String QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE((EMPNO IS NOT NULL AND EMPNO=?) OR "
																			  + "(ENAME IS NOT NULL AND ENAME=?) OR "
																			  + "(JOB IS NOT NULL AND JOB=?) OR "
																			  + "(SAL IS NOT NULL AND SAL=?))";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<EmployeeResultBO> fetchEmployees(EmployeeBO bo) {
		List<EmployeeResultBO> listBo=jt.query(QUERY, new EmployeeSearchResultSetExtractor(), bo.getEmpno(),bo.getEname(),bo.getJob(),bo.getSal());
		return listBo;
	}
	private class EmployeeSearchResultSetExtractor implements ResultSetExtractor<List<EmployeeResultBO>>{
		@Override
		public List<EmployeeResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeResultBO> listBo=new ArrayList<>();
			EmployeeResultBO rbo=null;
			while(rs.next()) {
				//create new ResultBO object
				rbo=new EmployeeResultBO();
				//add result set data into each ResultBo
				rbo.setEmpno(rs.getInt(1));
				rbo.setEname(rs.getString(2));
				rbo.setJob(rs.getString(3));
				rbo.setSal(rs.getInt(4));
				rbo.setDeptno(rs.getInt(5));
				//add result bo into listbo
				listBo.add(rbo);
			}
			//return listBo
			return listBo;
		}//extractData method
	}//ResultSetExtractor

}//DAO Class
