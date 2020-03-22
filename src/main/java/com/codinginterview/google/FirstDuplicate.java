package com.codinginterview.google;

import java.util.HashSet;

public class FirstDuplicate 
{
	public static void main(String[] args) 
	{
		int[] a= {2,1,3,5,3,2};
		int result = firstDuplication(a);
		System.out.println("result is " + result);

	}
	
	// Way 3 - The java.lang.Math.abs(int a) returns the absolute value of an int value.
	static int firstDuplication(int[] a)
	{		
		for (int i=0; i<a.length; i++)
		{
			if (a[Math.abs(a[i])-1]<0)
			{
				return Math.abs(a[i]);
			} else {
				a[Math.abs(a[i])-1] = -a[Math.abs(a[i])-1];
			}			
		}
		return -1;
	}
	
		
	// Way 2 - using data structure - HashSet()
//	static int firstDuplication(int[] a)
//	{
//		HashSet<Integer> seen = new HashSet<Integer>();
//		
//		for (int i=0; i<a.length; i++)
//		{
//			if (seen.contains(a[i]))
//			{
//				return a[i];
//			} else {
//				seen.add(a[i]);
//			}			
//		}
//		return -1;
//	}
	
	
	// Way 1
//	static int firstDuplication(int[] a)
//	{
//		int min_second_index = a.length;
//		
//		for (int i=0; i<a.length; i++)
//		{
//			for (int j=i+1; j<a.length; j++)
//			{
//				if(a[i] == a[j])
//				{
//					min_second_index = Math.min(min_second_index, j);
//				}
//			}
//		}
//		
//		if (min_second_index == a.length) return -1;
//		else return a[min_second_index];
//	}

}
