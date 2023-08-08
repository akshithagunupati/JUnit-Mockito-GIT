package com.akshithaSpring.JUnit;

public class MyMath {
    //Pass array and it would return sum of it.
	public int claculateSum(int[] nums) {
		int sum=0;
		for(int num:nums) {
			sum = sum+num;
		}
		return sum;
	}
}
