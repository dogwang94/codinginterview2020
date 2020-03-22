package com.codinginterview.hackerrank.Strings;

public class CommonChild {

	public static void main(String[] args) 
	{
		String s1 = "SHINCHAN";
		String s2 = "NOHARAAA";
		System.out.println(commonChild(s1, s2));

	}
	
	static int commonChild(String s1, String s2) 
	{
		int[][] mat = new int[s1.length() + 1][s2.length() + 1]; 
		for (int i = 0; i <= s1.length(); i++) 
		{ 
			mat[i][0] = 0; mat[0][i] = 0; 
		} 
		for (int i = 0; i < s1.length(); i++) 
		{ 
			for (int j = 0; j < s2.length(); j++) 
			{ 
				if (s1.charAt(i) == s2.charAt(j)) 
				{ 
					mat[i + 1][j + 1] = mat[i][j] + 1; 
				} else { 
					mat[i + 1][j + 1] = mat[i + 1][j] > mat[i][j + 1] ? mat[i + 1][j] : mat[i][j + 1]; 
				} 
			} 
		} 
		return mat[s1.length()][s1.length()];
    }

}
