package com.bi.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@Configuration
@ComponentScan(basePackages="com.bi.controller")
public class WebMvcAppConfig {
	
	//SimpleUrlHandlerMapping
	@Bean
	public HandlerMapping createSUHMapping() {
		SimpleUrlHandlerMapping suhm=null;
		Properties props=null;
		
		suhm=new SimpleUrlHandlerMapping();
		props=new Properties();
		props.setProperty("/home.htm", "pvc");
		suhm.setMappings(props);
		suhm.setOrder(Integer.MAX_VALUE-2);
		return suhm;
	}
	
	
	//ParameterizableViewController
	@Bean("pvc")
	public ParameterizableViewController createPVC() {
		ParameterizableViewController pvc=null;
		pvc=new ParameterizableViewController();
		pvc.setViewName("welcome");
		return pvc;
	}
	
	
}
