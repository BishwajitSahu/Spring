package com.bi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {PersistenceConfig.class,ServiceConfig.class})
public class RootAppConfig {

}
