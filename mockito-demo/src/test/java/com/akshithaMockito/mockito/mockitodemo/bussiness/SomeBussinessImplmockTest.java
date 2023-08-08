package com.akshithaMockito.mockito.mockitodemo.bussiness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class SomeBussinessImplmockTest {
//if I run this I will be getting null pointer exception. Instead I can create a stub for DataService.
//	@Test
//	void test() {
//		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl();
//		bussinessImpl.findGreatestData();
//	}
	
	
//Modified code
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBussinessImpl bussinessImpl;
	
	
	
	@Test
	void test() {
		when(dataServiceMock.retrieveallData()).thenReturn(new int[] {1,2,3,4});
		int result = bussinessImpl.findGreatestData();
		assertEquals(4, result);
	}

}
