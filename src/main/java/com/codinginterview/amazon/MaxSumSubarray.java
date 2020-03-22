package com.codinginterview.amazon;

/* 
 * Given an array of integers 
 * The algorithm to find the maximum subarray sum is called Kadane’s Algorithm.
 * For example: 
 * inputArray = [-2, 2, 5, -11, 6]
 * output should be arrayMaxConsecutiveSum2(inputArray) = 7
*/

public class MaxSumSubarray {

	public static void main(String[] args) 
	{
		int[] inputArray = {-2, 2, 5, -11, 6};
		int result = arrayMaxConsecutiveSum2(inputArray);
		
		System.out.println(result);

	}
	
	static int arrayMaxConsecutiveSum2(int[] inputArray) 
	{
		int max_sum = inputArray[0];
		int current_sum = max_sum;
		
		for (int i =0; i<inputArray.length; i++)
		{
			current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
			max_sum = Math.max(current_sum, max_sum);
		}
		return max_sum;
	}
	
	

}
