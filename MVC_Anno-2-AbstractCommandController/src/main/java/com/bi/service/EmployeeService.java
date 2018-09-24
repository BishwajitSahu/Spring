package com.bi.service;

import java.util.List;

import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;

public interface EmployeeService {
	public List<EmployeeResultDTO> getEmployeeList(EmployeeDTO dto);
}
