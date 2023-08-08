package com.akshithaMockito.mockito.mockitodemo.bussiness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBussinessImplTest {
//if I run this I will be getting null pointer exception. Instead I can create a stub for DataService.
//	@Test
//	void test() {
//		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl();
//		bussinessImpl.findGreatestData();
//	}
	
	
//Modified code
	@Test
	void test() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(dataServiceStub);
		int result = bussinessImpl.findGreatestData();
		assertEquals(4, result);
	}
	
	
	//creating a dummy dataService stub
	class DataServiceStub implements DataService{

		@Override
		public int[] retrieveallData() {
			// TODO Auto-generated method stub
			return new int[] {1,2,3,4};
		}
		
	}
}
