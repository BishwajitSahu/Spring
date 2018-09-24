package com.bi.service;

import java.util.List;

import com.bi.dto.EmployeeDTO;
import com.bi.dto.EmployeeResultDTO;

public interface EmployeeSearchService {
	public List<EmployeeResultDTO> getEmployee(EmployeeDTO dto);
}
