package com.codinginterview.hackerrank.array;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	static long arrayManipulation(int n, int[][] queries) {
        long max = 0L;
        int a, b, k;
        int[] arr = new int[n + 2];
        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0];
            b = queries[i][1];
            k = queries[i][2];

            for (int j = 0; j < arr.length; j++) {
                if (j >= a) {
                    arr[j] = arr[j] + k;
                }
                if (j > b) {
                    arr[j] = arr[j] - k;
                }
            }
        }
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        return max;
    }

}
