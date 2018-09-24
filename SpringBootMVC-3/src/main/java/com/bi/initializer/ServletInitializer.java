package com.bi.initializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.bi.configuration.SpringBootMvc3Application;
import com.bi.configuration.WebMvcAppConfig;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootMvc3Application.class,WebMvcAppConfig.class);
	}

}
