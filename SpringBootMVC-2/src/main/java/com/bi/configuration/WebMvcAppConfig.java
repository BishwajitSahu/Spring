package com.bi.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan(basePackages="com.bi.controller")
public class WebMvcAppConfig {
	
	@Bean("pvc")
	public ParameterizableViewController pvc() {
		ParameterizableViewController pvc=new ParameterizableViewController();
		pvc.setViewName("home");
		return pvc;
	}
	
	//create SimpleUrlHandlerMapping
	@Bean("suhm")
	public  SimpleUrlHandlerMapping suhm() {
		SimpleUrlHandlerMapping handlerMapping=null;
		Properties props=null;

		//create handler mapping object
		handlerMapping=new SimpleUrlHandlerMapping();
		props=new Properties();
		props.put("/home.htm", "pvc");
		handlerMapping.setMappings(props);
		handlerMapping.setOrder(39394);
		return handlerMapping;
	}
	
	@Bean("rmhm")
	public RequestMappingHandlerMapping rmhm() {
		return new RequestMappingHandlerMapping();
	}
}
