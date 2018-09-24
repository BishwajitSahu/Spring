package com.bi.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.bi.service")
public class RootAppConfig {
	
	@Bean
	public Calendar createCalendar() {
		return Calendar.getInstance();
	}
}
