package com.bi.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.bi.initializer.ServletInitializer;

@SpringBootApplication
//@Import(ServletInitializer.class)
public class SpringBootMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc2Application.class, args);
	}
}
