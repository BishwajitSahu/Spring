package com.bi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.EmployeeBO;
import com.bi.dao.EmployeeDAO;
import com.bi.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO dao;
	@Override
	public List<EmployeeDTO> getEmployees() {
		List<EmployeeDTO> listDto=new ArrayList<>();
		List<EmployeeBO> listBo=null;
		
		//use dao
		listBo=dao.getEmployees();
		
		listBo.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});
		return listDto;
	}
}
