package com.bi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bi.bo.LoginBO;
@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	private static final String CHECK_USER_QUERY="SELECT COUNT(*) FROM SERVLET_LOGIN WHERE UNAME=? AND PWD=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int validateUser(LoginBO bo) {
		int count=0;
		count=jt.queryForObject(CHECK_USER_QUERY, Integer.class, bo.getUname(),bo.getPwd());
		return count;
	}

}
