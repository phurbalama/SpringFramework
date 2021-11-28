package com.phurbalama.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.phurbalama.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.phurbalama.spring.basic.springin5steps.scope.PersonDAO;




//automatically scans the packages and sub packages
@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
  }

}
