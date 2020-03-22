package com.codinginterview.codesignal;


public class MutateArray {

	public static void main(String[] args) 
	{
		int[] a  = {4, 0, 1, -2, 3};
		int n=5;
		int[] result = mutateTheArray(n,a);
		for (int i = 0; i < n; i++) {
	         System.out.println(result[i]);
	     }
		
	}
	
	//Way 2 -  using the ternary operator
	static int[] mutateTheArray(int n, int[] a) 
	{
	    int b[] = new int[a.length];
	    if(a.length == 1)
	        return a;
	    for(int i = 0; i < a.length; i++) 
	    {
	            b[i] = (i == 0 ? 0 : a[i - 1]) + a[i] + (i == a.length-1 ? 0 : a[i + 1]);
	    }
	    return b;
	}
	
//	Way 1
//	static int[] mutateTheArray(int n, int[] a) 
//	{
//	    int b[] = new int[a.length];
//	    if(a.length == 1)
//	        return a;
//	    for(int i = 0; i < a.length; i++) 
//	    {
//	        if(i == 0) 
//	        {
//	            b[0] = 0 + a[i] + a[i + 1];
//	        }
//	        else if(i == a.length-1)
//	        {
//	            b[a.length-1] = a[i - 1] + a[i] + 0;
//	        }
//	        else
//	        {
//	            b[i] = a[i - 1] + a[i] + a[i + 1];
//	        }
//	    }
//	    return b;
//	}

}
