package com.bi.dao;

import java.util.List;

import com.bi.bo.EmployeeBO;
import com.bi.bo.EmployeeResultBO;

public interface EmployeeSearchDAO {
	public List<EmployeeResultBO> retrieveEmployee(EmployeeBO bo);
}
