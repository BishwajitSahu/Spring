package com.bi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages= "com.bi.controller")
@EnableWebMvc
public class WebMvcAppConfig {
	
	
	//ViewResolver
	@Bean
	public InternalResourceViewResolver createVr() {
		InternalResourceViewResolver vr=null;
		
		vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/pages/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
