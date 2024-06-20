package com.mkyong.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mkyong.core.service.HelloWorld;
import com.mkyong.core.serviceImpl.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "helloWorld")
	public HelloWorld printHelloWorld() {
		return new HelloWorldImpl();
	}

}
