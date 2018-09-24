package com.bi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.UserBO;
import com.bi.dao.LoginDAO;
import com.bi.dto.UserDTO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;
	
	@Override
	public String checkAuthentication(UserDTO dto) {
		UserBO bo=null;
		int count=0;
		bo=new UserBO();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//invoke dao method
		count=dao.authentication(bo);
		if(count==1) {
			return "Authentication Succeeded.";
		}
		else {
			return "Authentication failed.";
		}
	}

}
