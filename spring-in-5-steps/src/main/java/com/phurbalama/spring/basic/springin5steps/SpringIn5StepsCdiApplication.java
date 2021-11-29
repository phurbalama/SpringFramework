package com.phurbalama.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.phurbalama.spring.basic.componentscan.ComponentDAO;
import com.phurbalama.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.phurbalama.spring.basic.springin5steps.cdi.SomeCdiBusiness;
import com.phurbalama.spring.basic.springin5steps.cdi.SomeCdiDAO;
import com.phurbalama.spring.basic.springin5steps.scope.PersonDAO;




//automatically scans the packages and sub packages
//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {
	

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)){
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		
		
		LOGGER.info("{} dao-{}", business,business.getSomecdidao());
		}
		
		
  }

}
