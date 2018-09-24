package com.bi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.bo.EmployeeBO;
import com.bi.bo.EmployeeResultBO;
import com.bi.dao.EmployeeSearchDAO;
import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;
@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	@Autowired
	private EmployeeSearchDAO dao;

	public List<EmployeeResultDTO> getEmployee(EmployeeDTO dto) {
		List<EmployeeResultBO> lrbo = null;
		List<EmployeeResultDTO> lrdto = null;
		EmployeeBO bo = null;
		// convert dto to bo
		bo = new EmployeeBO();
		bo.setEmpNo(dto.getEmpNo());
		bo.seteName(dto.geteName());
		bo.setJob(dto.getJob());
		bo.setSal(dto.getSal());
		// use dao
		lrbo = dao.retrieveEmployee(bo);
		lrdto=new ArrayList<EmployeeResultDTO>();
		// copy listbo to list dto
		for (EmployeeResultBO rbo : lrbo) {
			EmployeeResultDTO rdto=null;
			rdto=new EmployeeResultDTO();
			rdto.setEmpNo(rbo.getEmpNo());
			rdto.seteName(rbo.geteName());
			rdto.setJob(rbo.getJob());
			rdto.setSal(rbo.getSal());
			rdto.setDeptNo(rbo.getDeptNo());
			rdto.setMgr(rbo.getMgr());
			//add each result dto to list result dto
			lrdto.add(rdto);
		}

		return lrdto;

	}

}
