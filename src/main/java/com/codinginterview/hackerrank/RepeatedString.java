package com.codinginterview.hackerrank;

/**
 * @author Liping.Wang
 * Function Description 
 * Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length 
 * in the infinitely repeating string. 
 * repeatedString has the following parameter(s): 
 * s: a string to repeat 
 * n: the number of characters to consider 
 */
public class RepeatedString {

	public static void main(String[] args) 
	{
		String s = "aba";
		int n = 10;
		long result = repeatedString(s, n);
		System.out.println(result);
	}
	
	static long repeatedString(String s, long n) {
	    long count = s.length()-s.replace("a", "").length();
	    long reps = n/s.length();
	    long rest = n%s.length();

	    count = count*reps;

	    for(int i = 0; i<rest; i++){
	        if(s.charAt(i) == 'a') count++;
	    }

	    return count;
	}

}
