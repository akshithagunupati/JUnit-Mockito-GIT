package com.akshithaSpring.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath math = new MyMath();
	@Test
	void calculateSumThreeNumberArray() {
		assertEquals(10, math.claculateSum(new int[] {1,2,3,4}));
	}

}
