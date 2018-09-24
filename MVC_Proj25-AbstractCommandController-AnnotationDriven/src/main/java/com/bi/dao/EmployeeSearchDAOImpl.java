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
@Repository
public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
	private static final String QUERY = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE((EMPNO IS NOT NULL AND EMPNO=?) OR (ENAME IS NOT NULL AND ENAME=?) OR (JOB IS NOT NULL AND JOB=?) OR (SAL IS NOT NULL AND SAL=?))";
	@Autowired
	private JdbcTemplate jt;

	public List<EmployeeResultBO> retrieveEmployee(EmployeeBO bo) {
		List<EmployeeResultBO> lrbo = null;

		lrbo = jt.query(QUERY, new EmployeeSearchSetExtractor(), bo.getEmpNo(), bo.geteName(), bo.getJob(),
				bo.getSal());
		return lrbo;
	}

	public class EmployeeSearchSetExtractor implements ResultSetExtractor<List<EmployeeResultBO>> {

		public List<EmployeeResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 
			List<EmployeeResultBO> lrbo = new ArrayList<EmployeeResultBO>();
			EmployeeResultBO rbo =null;
			while (rs.next()) {
				// create resultbo obejct
				rbo= new EmployeeResultBO();
				// copy ResultSet data into EmployeeResultBO
				rbo.setEmpNo(rs.getInt(1));
				rbo.seteName(rs.getString(2));
				rbo.setJob(rs.getString(3));
				rbo.setSal(rs.getInt(4));
				rbo.setDeptNo(rs.getInt(5));
				rbo.setMgr(rs.getInt(6));
				// add each rbo to list object
				lrbo.add(rbo);
			}
			return lrbo;
		}// extractData method

	}// innerclass

}// outer class
