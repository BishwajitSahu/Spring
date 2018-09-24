package com.bi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceBeansConfig.class)
public class RootAppConfig {

}
