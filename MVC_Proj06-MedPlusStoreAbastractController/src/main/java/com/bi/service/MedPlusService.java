package com.bi.service;

import java.util.List;

import com.bi.dto.MedicineDetailsDTO;

public interface MedPlusService {
	public List<MedicineDetailsDTO> fetchAllMedicines();
}
