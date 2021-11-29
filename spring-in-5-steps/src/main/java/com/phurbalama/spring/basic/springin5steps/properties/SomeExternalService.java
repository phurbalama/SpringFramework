package com.phurbalama.spring.basic.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	//get values from external property file
	@Value("${external.services.url}")
	private String url;

	public String returnServiceURL() {
		return url;
	}
}
