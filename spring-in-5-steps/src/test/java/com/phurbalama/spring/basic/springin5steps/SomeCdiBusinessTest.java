package com.phurbalama.spring.basic.springin5steps;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.phurbalama.mockito.mockitodemo.DataService;
import com.phurbalama.mockito.mockitodemo.SomeBusinessImpl;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {


	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testFindTheGreatestFromAllData() {
		// using Mockito Annotation code less
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,2,2});
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
	}
	
	@Test
	public void testFindTheGreatestFromOneData() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {2});
		SomeBusinessImpl businessimpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessimpl.findTheGreatestFromAllData();
		assertEquals(2,result);
	}
}
