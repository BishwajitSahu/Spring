package com.bi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {ServiceConfig.class,PersitenceConfig.class})
public class RootAppConfig {

}
