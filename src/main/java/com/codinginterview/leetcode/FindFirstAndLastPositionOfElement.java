package com.codinginterview.leetcode;

/*
 * Given an array of integers nums sorted in ascending order
 * Find the starting and ending position of a given target value
 * must be in the order of O(log n), means a binary searching
 * Input: nums = [5, 7, 7, 8, 8, 10], target = 8
 * output: [3,4]
 */

public class FindFirstAndLastPositionOfElement {

	public static void main(String[] args) 
	{
		int[] ipt = {5, 7, 7, 8, 8, 10};
		int tgt = 8;
		int[] re = searchRange(ipt, tgt);
		
		for (int i =0; i<re.length; i++)
		{
			System.out.println(re[i]);
		}
		

	}
	
	static int[] searchRange(int[] nums, int target)
	{
		int[] result = new int[2];
		result[0] = findStartingIndex(nums, target);
		result[1] = findEndingIndex(nums, target);
		return result;
	}
	
	static int findStartingIndex(int[] nums, int target)
	{
		int index = -1;
		int start = 0;
		int end = nums.length-1;
		while (start <= end)
		{
			int midpoint = start + (end-start)/2;
			if (nums[midpoint]>=target)
			{
				end = midpoint - 1;
			} else {
				start = midpoint + 1;
			}
			if(nums[midpoint] == target) index = midpoint;
		}
		return index;
	}
	
	static int findEndingIndex(int[] nums, int target)
	{
		int index = -1;
		int start = 0;
		int end = nums.length-1;
		while (start <= end)
		{
			int midpoint = start + (end-start)/2;
			if (nums[midpoint]<=target)
			{
				start = midpoint + 1;
			} else {
				end = midpoint - 1;
			}
			if(nums[midpoint] == target) index = midpoint;
		}
		return index;
	}

}
