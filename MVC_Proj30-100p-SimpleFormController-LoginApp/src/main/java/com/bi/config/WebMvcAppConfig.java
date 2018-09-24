package com.bi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.bi.interceptor.DoublePostingPreventionInterceptor;

@Configuration
@ComponentScan(basePackages= {"com.bi.controller","com.bi.validator"})
@EnableWebMvc
public class WebMvcAppConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new DoublePostingPreventionInterceptor());
	}
	@Bean(name="vr")
	public InternalResourceViewResolver createViewResolver() {
		InternalResourceViewResolver irvr=null;
		irvr=new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource createMsgSource() {
		ResourceBundleMessageSource rbms=null;
		rbms=new ResourceBundleMessageSource();
		rbms.setBasename("com/bi/commons/Validator");
		return rbms;
	}
}
