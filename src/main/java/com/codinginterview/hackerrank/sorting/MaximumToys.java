package com.codinginterview.hackerrank.sorting;

import java.util.Arrays;

/**
 * @author Liping.Wang
 * Function Description
 * Complete the function maximumToys in the editor below. It should return an integer representing the maximum number of toys Mark can purchase. 
 * maximumToys has the following parameter(s): 
 * prices: an array of integers representing toy prices 
 * k: an integer, Mark's budget
 */
public class MaximumToys {

	public static void main(String[] args) 
	{
		int[] price = {1,12,5,111,200,1000,10};
		int having = 50;
		System.out.println(maximumToys(price,having));

	}
	
	static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int i = 0;
        while(k - prices[i] >= 0){
            k = k - prices[i];
            i++;
        }
        return i;
    }

}
