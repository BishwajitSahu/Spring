package com.bi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.bi.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	private static final String GET_ALL_STUDENTS = "SELECT SNO,SNAME,SADD,COURSE FROM STUDENT";
	private static final String GET_STUDENT_BY_SNO="SELECT SNAME,SADD,COURSE FROM STUDENT WHERE SNO=?";

	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	
	
	public List<StudentBO> getAllStudents() {
		List<StudentBO> listBO = jt.query(GET_ALL_STUDENTS, new StudentResultSetExtractor());
		return listBO;
	}// getAllStudent

	class StudentResultSetExtractor implements ResultSetExtractor<List<StudentBO>> {

		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<StudentBO> listBO = null;
			listBO = new ArrayList<StudentBO>();
			// process result set
			while (rs.next()) {
				StudentBO bo = new StudentBO();
				bo.setSno(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setSadd(rs.getString(3));
				bo.setCourse(rs.getString(4));
				// add bo to listBO
				listBO.add(bo);
			}
			return listBO;
		}// inner class StudentResultSetExtractor
	}

	
	
	
	
	public StudentBO getStudent(int sno) {
		StudentBO bo=null;
		
		bo=jt.queryForObject(GET_STUDENT_BY_SNO, new StudentBySnoRowMapper(),sno);
		return null;
	}
	class StudentBySnoRowMapper implements RowMapper<StudentBO>{
		public StudentBO mapRow(ResultSet rs, int sno) throws SQLException {
			StudentBO bo=null;
			bo=new StudentBO();
			//set values to bo
			/*bo.setSno(rs.getInt(1));*/
			bo.setSname(rs.getString(1));
			bo.setSadd(rs.getString(2));
			bo.setCourse(rs.getString(3));		
			return bo;
		}
	}
}
