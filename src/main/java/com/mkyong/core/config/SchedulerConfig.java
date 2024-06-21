package com.mkyong.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mkyong.core.model.SchedulerBO;

@Configuration
public class SchedulerConfig {

	@Bean(name = "schedulerConfig")
	public SchedulerBO printMsg() {
		return new SchedulerBO();
	}
}
