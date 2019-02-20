package com.niket.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.niket.main.SubArray;

public class SubArrayTest {
	@Test
	public void SubArraytest() {
		int testCase1[] = { -2, -1, -3, 4, -1, 2, 1, -5, 4 };
		assertEquals(SubArray.findMaxSumSubArray(testCase1), 6);
		int testCase2[] = { 0,-2, -1, -3, -4, -1, -2, -1, -5};
		assertEquals(SubArray.findMaxSumSubArray(testCase2),0);
		int testCase3[] ={ -10,-2, -1, -3, -4, -1, -2, -1, 10}; 
		assertEquals(SubArray.findMaxSumSubArray(testCase3),10);
		int testCase4[] ={1};
		assertEquals(SubArray.findMaxSumSubArray(testCase4),1);
		int testCase5[] ={10,-1,-2,-4,20};
		assertEquals(SubArray.findMaxSumSubArray(testCase5),23);
		int testCase6[] = {10,1,2,4,20};
		assertEquals(SubArray.findMaxSumSubArray(testCase6),37);
	}

}
