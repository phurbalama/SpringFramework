package com.phurbalama.spring.basic.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//this is a dependency
@Component
public class BinarySearchImpl {
	
	//this is a dependency it means sortAlgorithm is a dependency for BinarySearch
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


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
	
	
}
