package com.mkyong.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mkyong.core.model.CustomerBO;

@Configuration
public class CustomerConfig {

	@Bean(name = "customerConfig")
	public CustomerBO printMsg() {
		return new CustomerBO();
	}
}
