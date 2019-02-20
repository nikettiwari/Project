package com.niket.main;

public class SubArray {

	/**
	 * function to find max sum from Subarray
	 */
	 public static int findMaxSumSubArray(int arr[]) {
		int maxSum = Integer.MIN_VALUE, currentSum = 0; // initializing maxSum variable as lowest minimum integer value 
														// initializing current sum as 0 to calculate the sum of Subarray
		int startPoint = 0, endPoint = 0, flag = 0; // startPoint variable is starting point of Largest Sum Contiguous
													// Subarray, endPoint variable is end point of Largest Sum Contiguous Subarray.
		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];
			if (currentSum < 0) { // currentSum should be >=0 because as problem describe there will be atleast
									// one positive no, flag variable will track the starting point of new subarray
				currentSum = 0;
				flag = i + 1;
			} else if (maxSum < currentSum) { // Assigning maxsum= currentSum if previous maxsum is less than current max

				maxSum = currentSum; // Assigning start and end point of max subarray
				startPoint = flag;
				endPoint = i;
			}
		}
		System.out.println("\n\nLargest Subarray is ");
		System.out.println("Start index: " + startPoint);
		System.out.println("Length: " + (endPoint - startPoint + 1));
		System.out.print("Elements:");
		for (int i = startPoint; i <= endPoint; i++)  
			System.out.print(" " + arr[i]);
		return maxSum;
	}

	public static void main(String[] args) {
		int arr[] = { -2, -1, -3, 4, -1, 2, 1, -5, 4 };  // when max sum is in middle of array
		System.out.println("\nSum: " + findMaxSumSubArray(arr));
	}
}
