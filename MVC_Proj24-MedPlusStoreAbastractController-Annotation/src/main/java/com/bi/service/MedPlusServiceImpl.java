package com.bi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.bo.MedicineDetailsBO;
import com.bi.dao.MedPlusDAO;
import com.bi.dto.MedicineDetailsDTO;
@Service
public class MedPlusServiceImpl {
	@Autowired
	private MedPlusDAO dao;
	//@RequestMapping
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
