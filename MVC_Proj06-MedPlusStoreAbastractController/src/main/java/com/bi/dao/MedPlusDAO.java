package com.bi.dao;

import java.util.List;

import com.bi.bo.MedicineDetailsBO;

public interface MedPlusDAO {
	public List<MedicineDetailsBO> retrieveAllMedicines();
}
