package com.codinginterview.hackerrank.Strings;

/**
 * @author Liping.Wang
 * Function Description
 * Complete the substrCount function in the editor below. It should return an integer representing the number of special substrings that can be formed from the given string. 
 * substrCount has the following parameter(s):
 * n: an integer, the length of string s
 * s: a string
 */
public class SpecialStringAgain {

	public static void main(String[] args) 
	{
		String s = "aaaa";
		int n =7;
		System.out.println(substrCount(n, s));

	}
	
	static long substrCount(int n, String s) 
	{
		long count = 0;
	    for (int i = 0; i < s.length(); i++) 
	    {
	        int innerCounter = 1;
	        int counterDown = 0;
	        int counterUp = 1;
	        
	        while (i - innerCounter >= 0 && i + innerCounter < s.length()
	                && s.charAt(i - innerCounter) == s.charAt(i - 1) && s.charAt(i + innerCounter) == s.charAt(i - 1)) {
	            count++;
	            innerCounter++;
	        }

	        while (i - counterDown >= 0 && i + counterUp < s.length() && s.charAt(i - counterDown) == s.charAt(i)
	                && s.charAt(i + counterUp) == s.charAt(i)) {
	            count++;
	            counterDown++;
	            counterUp++;
	        }
	    }

	    return count + s.length();

    }

}
