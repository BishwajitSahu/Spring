package com.bi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bi.dto.MedicineDetailsDTO;
import com.bi.service.MedPlusServiceImpl;


@Controller
public class GetAllMedicineController {
	@Autowired
	private MedPlusServiceImpl service;

	@RequestMapping("get_all_medicines.htm")
	public String process(Map<String, Object> map) throws Exception {
		List<MedicineDetailsDTO> dto=null;
		//use service
		dto=service.fetchAllMedicines();
		map.put("medicines",dto);
		return "show_medicines";
	}

}
