package com.bi.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegisterController extends SimpleFormController {
	@Override
	public Map referenceData(HttpServletRequest request) throws Exception {
		Map<String,List<String>> map=null;
		return map;
	}
}
