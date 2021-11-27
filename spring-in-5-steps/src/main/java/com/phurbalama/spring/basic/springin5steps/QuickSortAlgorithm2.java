package com.phurbalama.spring.basic.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//can have more component 
@Primary//gives more importance 
public class QuickSortAlgorithm2 implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
