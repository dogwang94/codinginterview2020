package com.codinginterview.hackerrank.array;

import java.util.Arrays;

public class ArraysLeftRotation {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int n = 5;	
	
		System.out.println(Arrays.toString(rotleft(a, n)));	

	}
	
	static int[] rotleft(int[]a, int d)
	{
		int size =  a.length;
		int[] rotated_arr = new int[size];
		int i = 0;
		int rotate_index = d;
		
		while (rotate_index < size)
		{
			rotated_arr[i] = a[rotate_index];
			i++;
			rotate_index++;
		}
		
		rotate_index = 0;
		while (rotate_index <d)
		{
			rotated_arr[i] = a[rotate_index];
			i++;
			rotate_index++;
		}
		
		return rotated_arr;
	}
}