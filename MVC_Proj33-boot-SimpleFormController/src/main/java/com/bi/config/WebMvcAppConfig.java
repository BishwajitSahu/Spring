package com.bi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.bi.controller","com.bi.validator"})
public class WebMvcAppConfig {

}
