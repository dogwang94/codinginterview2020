package com.codinginterview.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array of integers, 1<=a[i]<=n (n=size of array)
 * some elements appear twice and other appear once.
 * Find all the elments that appear twice in the array
 * do it WITHOUT extra space and in O(n) runtime
 * input: [4, 3, 2, 7, 8, 2, 3, 1]
 * output: [2, 3]
 */

public class FindAllDupInArray {

	public static void main(String[] args) 
	{
		int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> result = findDuplicates(input);
		System.out.println(result.toString());	
	}
	
	
	//The java.lang.Math.abs() returns the absolute value of a given argument.
	static List<Integer> findDuplicates(int[] nums)
	{
		List<Integer> output_arr = new ArrayList();
		
		for (int i=0; i<nums.length; i++)
		{
			int index = Math.abs(nums[i]) - 1;
			if(nums[index]<0) output_arr.add(index + 1);
			nums[index] = -nums[index];		
		}
		return output_arr;
	}

}
