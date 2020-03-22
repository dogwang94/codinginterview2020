package com.codinginterview.hackerrank;

/**
 * @author Liping.Wang
 * Function Description 
 * Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed. 
 * countingValleys has the following parameter(s): 
 * n: the number of steps Gary takes 
 * s: a string describing his path 
 */
public class CountingValleys {

	public static void main(String[] args) 
	{
		int n = 8;
		String s = "UDDDUDUU";
		int result = countingValleys(n, s);
		System.out.println(result);

	}
	
	static int countingValleys(int n, String s) 
	{
	    int valleyCount = 0;
	    int currentState = 0;

	    for(int i=0; i<s.length(); i++) {
	        if(s.charAt(i)=='U') {
	            currentState++;
	        } else {
	            currentState--;
	                            // Moved from sea level to vally
	            if(currentState == -1){
	                valleyCount++;
	            }
	        }
	    }
	    return valleyCount;

	}

}
