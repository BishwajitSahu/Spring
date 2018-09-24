package com.bi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("tilesController")
public class TilesController {
	//home page
	@RequestMapping(value="/home.htm")
	public String showHome(){
		return "homeDef";
	}
	
	
	//java page
	@RequestMapping(value="/java.htm")
	public String javaPage() {
		return "javaDef";
	}
	
	//dotnet page
	@RequestMapping(value="/dotNet.htm")
	public String dotnetPage() {
		return "dotNetDef";
	}
	
	//python page
	@RequestMapping(value="/python.htm")
	public String pythonPage() {
		return "pythonDef";
	}
	
	
}
