package com.bi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bi.bo.UserBO;
@Repository
public class LoginDAOImpl implements LoginDAO {
	private static final String QUERY="SELECT COUNT(*) FROM SERVLET_LOGINTABLE WHERE UNAME=? AND PWD=?";
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public int authentication(UserBO bo) {
		int count=jt.queryForObject(QUERY,Integer.class,bo.getUser(),bo.getPwd());
		return count;
	}

	
}
