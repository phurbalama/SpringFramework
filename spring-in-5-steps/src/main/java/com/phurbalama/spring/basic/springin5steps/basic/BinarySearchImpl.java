package com.phurbalama.spring.basic.springin5steps.basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//this is a dependency
@Component
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//this is a dependency it means sortAlgorithm is a dependency for BinarySearch
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Tight Coupling since only bubblesortalgorithm can be used
		//BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//Sorting an array
		
		//Search the array
		
		//Return the result
		return 3;
	}
	
	//as soon as bean is created, post construct is called
	/*@PostConstruct
	public void postConstruct() {
		logger.info("postconstruct");
	}
	
	//when bean instance is being removed pre destroy is called 
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}*/
	
	
}
