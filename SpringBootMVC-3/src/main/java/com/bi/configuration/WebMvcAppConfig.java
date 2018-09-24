package com.bi.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@Configuration
@ComponentScan(basePackages="com.bi.controller")
public class WebMvcAppConfig {

	@Bean("pvc")
	public ParameterizableViewController getPvc() {
		ParameterizableViewController pvc=new ParameterizableViewController();
		pvc.setViewName("home");
		return pvc;
	}
	
	@Bean("suhm")
	public SimpleUrlHandlerMapping suhm() {
		SimpleUrlHandlerMapping suhm=new SimpleUrlHandlerMapping();
		Properties props=new Properties();
		props.put("/home.htm", "pvc");
		suhm.setMappings(props);
		suhm.setOrder(3435);
		return suhm;
	}
	
	
}
