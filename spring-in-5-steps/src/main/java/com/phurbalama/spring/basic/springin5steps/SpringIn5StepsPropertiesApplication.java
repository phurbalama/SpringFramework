package com.phurbalama.spring.basic.springin5steps;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.phurbalama.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.phurbalama.spring.basic.springin5steps.properties.SomeExternalService;




//automatically scans the packages and sub packages
//@SpringBootApplication
@Configuration
@ComponentScan
//app.properties Values get from External
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	//what are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?
	
	public static void main(String[] args) {
		//pass a object of sorting algorithm
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application Context
		//ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)){
		
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		
		System.out.println(service.returnServiceURL());
		
		
		}
		
  }

}
