package com.bi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.EmployeeBO;
import com.bi.dao.EmployeeDAO;
import com.bi.dto.EmployeeDTO;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao;
	@Override
	public int registerEmp(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		//convert dto to bo
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insertData(bo);
		return count;
	}
}
