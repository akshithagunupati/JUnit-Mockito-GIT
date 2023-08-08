package com.akshithaMockito.mockito.mockitodemo.bussiness;

public class SomeBussinessImpl {
    public DataService dataService;
    
    public SomeBussinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findGreatestData() {
    	int[] data = dataService.retrieveallData();
    	int great = Integer.MIN_VALUE;
    	for(int value:data) {
    		if(value>great)
    			great = value;
    	}
    	return great;
    }
}

interface DataService{
	int[] retrieveallData();
}
