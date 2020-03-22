package com.codinginterview.google;

import java.util.HashSet;

public class SumOfTwo {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3};
		int[] b = {10,20,30,40};
		int v =42;
		// 40+2=42 sumOfTwo(a,b,v) = true
		System.out.println(sumOfTwo(a,b,v));
	}
	
	//Way 2 - using data structure - HashSet
	static boolean sumOfTwo(int[] a, int[] b, int v)
	{
		HashSet<Integer> differences = new HashSet<Integer>();
		
		for (int i =0; i<a.length; i++)
		{
			int difference = v- a[i];		
			differences.add(difference);
		}
		
		for (int i =0; i<b.length; i++)
		{
			if (differences.contains(b[i])) return true;
		}
		
		return false;
	}
	
	
	//Way 1
//	static boolean sumOfTwo(int[] a, int[] b, int v)
//	{
//		for(int i=0; i<a.length; i++)
//		{
//			int needed_value = v - a[i];
//			for (int j=0; j<b.length; j++)
//			{
//				if(b[j] == needed_value)
//				{
//					return true;
//				}
//			}
//		}
//		return false;		
//	}

}
