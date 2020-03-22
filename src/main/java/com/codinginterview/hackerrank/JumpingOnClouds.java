package com.codinginterview.hackerrank;

/**
 * @author Liping.Wang
 * Function Description: 
 * Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
 * jumpingOnClouds has the following parameter(s): 
 * c: an array of binary integers 
 */
public class JumpingOnClouds {

	public static void main(String[] args) 
	{
		int[] c = {0,0,1,0,0,1,0};
		int result = jumpingOnClouds(c);
		System.out.println(result);

	}
	
	static int jumpingOnClouds(int[] c) {
	    int jumps = 0;
	    for(int i = 0; i < c.length - 1; i++){
	        jumps++;
	        if( i  + 2 < c.length && c[i + 2] == 0){
	            i++;
	        }
	    }
	    return jumps;
	}

}
