package com.bi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.EmployeeBO;
import com.bi.bo.EmployeeResultBO;
import com.bi.dao.EmployeeDAO;
import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	
	public List<EmployeeResultDTO> getEmployeeList(EmployeeDTO dto) {
		EmployeeBO bo=new EmployeeBO();
		List<EmployeeResultBO> listRBO=null;
		List<EmployeeResultDTO> listRDTO=new ArrayList<>();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dao
		listRBO=dao.fetchEmployees(bo);
		//convert listRBo to listRDTO
		listRBO.forEach(rbo->{
			EmployeeResultDTO rdto=new EmployeeResultDTO();
			BeanUtils.copyProperties(rbo, rdto);
			//add each rdto to listRDTO
			listRDTO.add(rdto);
		});
		//return listRDTO to controller
		return listRDTO;
	}

}
