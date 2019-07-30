package com.springboot.core;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.core.config.ProxyConfigs;

@Component
public class UrlFetcher {

	@Autowired
	ProxyConfigs configs;

	@PostConstruct
	public void init() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("********************************************************************************");
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(configs));
		System.out.println("********************************************************************************");
	}

}
