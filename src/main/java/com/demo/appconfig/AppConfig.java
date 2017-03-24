package com.demo.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.service.Service;
import com.demo.service.ServiceImpl;

@Configuration
public class AppConfig {
	@Bean
	public Service getService() {
		return new ServiceImpl();
	}
}
