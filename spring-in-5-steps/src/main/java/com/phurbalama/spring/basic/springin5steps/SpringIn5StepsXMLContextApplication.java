package com.phurbalama.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phurbalama.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.phurbalama.spring.basic.springin5steps.xml.XmlPersonDAO;




//automatically scans the packages and sub packages
//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {
	//what are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {
		//pass a object of sorting algorithm
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application Context
		//ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		
		LOGGER.info("{} {}",personDAO,personDAO.getXmlJdbcConnection() );
		
		}
		
  }

}
