package com.bi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bi.bo.LoginBO;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	private static final String QUERY_FOR_OBJECT="SELECT COUNT(*) FROM SERVLET_LOGINTABLE WHERE(UNAME=? AND PWD=?)";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int check(LoginBO bo) {
		int result=0;
		System.out.println("LoginDAOImpl.check()");
		result=jt.queryForObject(QUERY_FOR_OBJECT, Integer.class, bo.getUname(),bo.getPwd());
		return result;
	}

}
