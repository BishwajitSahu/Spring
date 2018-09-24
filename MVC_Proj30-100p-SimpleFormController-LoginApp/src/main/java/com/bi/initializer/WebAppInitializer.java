package com.bi.initializer;


import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.bi.config.RootAppConfig;
import com.bi.config.WebMvcAppConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {WebMvcAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"*.htm"};
	}
	
}
