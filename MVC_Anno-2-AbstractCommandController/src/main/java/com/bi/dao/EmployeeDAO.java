package com.bi.dao;

import java.util.List;

import com.bi.bo.EmployeeBO;
import com.bi.bo.EmployeeResultBO;

public interface EmployeeDAO {
	public List<EmployeeResultBO> fetchEmployees(EmployeeBO bo);
}
