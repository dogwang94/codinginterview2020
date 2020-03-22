package com.codinginterview.hackerrank;


import java.util.HashSet;

/**
 * @author Liping.Wang
 * Complete the sockMerchant function in the editor below. 
 * It must return an integer representing the number of matching pairs of socks that are available. 
 * sockMerchant has the following parameter(s): 
 * n: the number of socks in the pile 
 * ar: the colors of each sock 
 */
public class SockMerchant {

	public static void main(String[] args) 
	{
		int[] a = {10,20,20,10,10,30,50,10,20};
		int n = 9;
		int result = sockMerchant(n, a);
		System.out.println(result);

	}
	
	static int sockMerchant(int n, int[] ar)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int count = 0;
		
		for (int i=0; i<n; i++)
		{
			int element = ar[i];
			if (hs.contains(element))
			{
				hs.remove(element);
				count++;
			} else {
				hs.add(element);
			}
		}
		return count;
	}

}
