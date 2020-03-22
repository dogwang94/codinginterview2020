package com.codinginterview.hackerrank.array;

import java.util.Arrays;
import java.util.Scanner;

public class HourGlassProblem {

	public static void main(String[] args) 
	{
		int [][] arr = {{1,1,1,0,0,0},
						{0,1,0,0,0,0},
						{1,1,1,0,0,0},
						{0,0,2,4,4,0},
						{0,0,0,2,0,0},
						{0,0,1,2,4,0}};
		//another way to print 2D array
		System.out.println(Arrays.deepToString(arr));
		

		System.out.println("result is " + hourglassSum(arr));
	}
	
	static int hourglassSum(int[][] arr) {
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < arr.length - 2; i++) {
	        for (int j = 0; j < arr.length - 2; j++) {
	            int hourGlassSum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2])
	                    + (arr[i + 1][j + 1])
	                    + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
	            max = Math.max(hourGlassSum,max);
	        }

	    }
	    return max;
	}
	
//	static int hourglassSum(int[][] arr) 
//	{
//		int[][] matrix = new int[6][6];
//
//		@SuppressWarnings("resource")
//		Scanner in = new Scanner(System.in);
//
//		for (int i = 0; i < 6; i++) {
//			String[] tmp = in.nextLine().split(" ");
//			int j = 0;
//			for (String s:tmp) {
//				matrix[i][j++] = Integer.parseInt(s);
//			}
//		}
//		
//		int maxScore = -999990;
//
//		for (int i = 0; i < 4; i++) 
//		{
//			for (int j = 0; j < 4; j++) 
//			{
//				int tmp = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] + matrix[i + 1][j + 1] + matrix[i + 2][j]
//						+ matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
//
//				maxScore = Math.max(maxScore, tmp);
//			}
//		}
//		return maxScore;
	}


