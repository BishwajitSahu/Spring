package com.bi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//alternate to dispatcher-Servlet.xml
@Configuration
@ComponentScan(basePackages="com.bi.controller")
public class WebMvcConfig {
	
}
