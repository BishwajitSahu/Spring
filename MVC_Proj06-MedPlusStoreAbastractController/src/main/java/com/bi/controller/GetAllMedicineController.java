package com.bi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bi.dto.MedicineDetailsDTO;
import com.bi.service.MedPlusService;

public class GetAllMedicineController extends AbstractController {
	private MedPlusService service;
	
	public GetAllMedicineController(MedPlusService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<MedicineDetailsDTO> dto=null;
		ModelAndView mav=null;
		//use service
		dto=service.fetchAllMedicines();
		mav=new ModelAndView();
		mav.setViewName("show_medicines");
		mav.addObject("medicines",dto);
		return mav;
	}

}
