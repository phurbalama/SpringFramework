package com.phurbalama.spring.basic.springin5steps;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.phurbalama.spring.basic.springin5steps.basic.BinarySearchImpl;




//automatically scans the packages and sub packages
//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {
	//what are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?
	
	public static void main(String[] args) {
		//pass a object of sorting algorithm
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application Context
		//ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)){
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		int result = binarySearch.binarySearch(new int[] {1,2,4,6}, 3);
		System.out.println(result);
		
		}
		
  }

}
