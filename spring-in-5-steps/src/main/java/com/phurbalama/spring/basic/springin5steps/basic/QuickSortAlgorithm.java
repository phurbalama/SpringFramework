package com.phurbalama.spring.basic.springin5steps.basic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component//can have more component 
//@Primary//gives more importance 
@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
