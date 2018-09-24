package com.bi.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bi.command.UserCommand;
import com.bi.dto.UserDTO;
import com.bi.service.LoginService;
import com.bi.validator.MyValidator;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	@Autowired
	private MyValidator validator;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map) {
		UserCommand cmd=null;
		cmd=new UserCommand();
		cmd.setUser("raja");
		cmd.setPwd("rani");
		map.put("userCmd", cmd);
		return "login_form";
	}
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String authenticate(Map<String, Object> map,@Valid @ModelAttribute("userCmd")UserCommand cmd,BindingResult errors) {
		UserDTO dto=null;
		String result=null;
		//convert command to dto
		dto=new UserDTO();
		dto.setUser(cmd.getUser());
		dto.setPwd(cmd.getPwd());
		
		//validate
		if(validator.supports(UserCommand.class)) {
			System.out.println("LoginController.authenticate()-if block");
			validator.validate(cmd,errors);
			if(errors.hasErrors()) {
				//return logical view name
				return "login_form";
			}
		}
		//invoke service method
		result=service.checkAuthentication(dto);
		map.put("result", result);
		System.out.println(result);
		System.out.println(cmd);
		return "login_form";
	}
	
	
	@ModelAttribute("domains")
	public List<String> referenceData() {
		ArrayList<String> list=new ArrayList<>();
		list.add("google");
		list.add("yahoo");
		list.add("bing");
		return list;
	}
	
	@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {
		Map<String, String> countryList = new HashMap<String, String>();
	    countryList.put("US", "United States");
	    countryList.put("CH", "China");
	    countryList.put("SG", "Singapore");
	    countryList.put("MY", "Malaysia");
	    return countryList;
	}
	
	@InitBinder
	public void myInitBinder(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}
