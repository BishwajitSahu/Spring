package com.bi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bi.bo.MedicineDetailsBO;
import com.bi.dao.MedPlusDAO;
import com.bi.dto.MedicineDetailsDTO;

public class MedPlusServiceImpl implements MedPlusService {
	private MedPlusDAO dao;
	
	public MedPlusServiceImpl(MedPlusDAO dao) {
		this.dao = dao;
	}

	public List<MedicineDetailsDTO> fetchAllMedicines() {
		List<MedicineDetailsBO> listBo=null;
		List<MedicineDetailsDTO> listDto=null;
		MedicineDetailsDTO dto=null;
		//use dao
		listBo=dao.retrieveAllMedicines();
		listDto=new ArrayList();
		//converti listBo to listDto
		for(MedicineDetailsBO bo: listBo) {
			dto=new MedicineDetailsDTO();
			BeanUtils.copyProperties(bo, dto);
			//add each dto to listDto
			listDto.add(dto);
		}
		return listDto;
	}

}
