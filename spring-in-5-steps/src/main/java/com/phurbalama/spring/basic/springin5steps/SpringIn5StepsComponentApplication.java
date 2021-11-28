package com.phurbalama.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.phurbalama.spring.basic.componentscan.ComponentDAO;
import com.phurbalama.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.phurbalama.spring.basic.springin5steps.scope.PersonDAO;




//automatically scans the packages and sub packages
@SpringBootApplication
@ComponentScan("com.phurbalama.spring.basic.componentscan")
public class SpringIn5StepsComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		//PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}", componentDAO);
		
  }

}
