package com.bi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.LoginBO;
import com.bi.dao.LoginDAO;
import com.bi.dto.LoginDTO;

@Service("logineService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;
	
	@Override
	public String verifyUser(LoginDTO dto) {
		LoginBO bo=null;
		int count=0;
		//convert DTO to bo
		bo=new LoginBO();
		BeanUtils.copyProperties(dto, bo);
		
		System.out.println("LoginServiceImpl.verifyUser()");
		//use dao
		count=dao.check(bo);
		System.out.println(count);
		if(count==1) {
			return "Login Successful";
		}
		else
			return "Invalid Login";
	}

}
