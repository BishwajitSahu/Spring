package com.bi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.LoginBO;
import com.bi.dao.LoginDAO;
import com.bi.dto.LoginDTO;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO dao;
	
	@Override
	public String validateUser(LoginDTO dto) {
		int count=0;
		LoginBO bo=null;
		//convert dto to bo
		bo=new LoginBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.validateUser(bo);
		//check user exists or not
		if(count==0) {
			return "UserName or Password not matched";
		}
		else
			return "login successfull";
	}

}
