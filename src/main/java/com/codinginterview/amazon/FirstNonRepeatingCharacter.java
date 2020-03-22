package com.codinginterview.amazon;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) 
	{
		String s = "aaabcccdeeef";
		char result = firstNonRepeatingCharacter(s);
		System.out.println("result is " + result);

	}
	
	
	//Way 4 - using indexOf()
	static char firstNonRepeatingCharacter(String s) 
	{
		for(int i=0; i<s.length(); i++)
		{
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
			{
				return s.charAt(i);
			}
		}
		
		return '_';
	}
	
	
	//Way 3 - 
//	static char firstNonRepeatingCharacter(String s) 
//	{
//		int[] char_acounts =  new int[26];
//		
//		for(char c: s.toCharArray()) char_acounts[c - 'a']++;
//		
//		for(char c: s.toCharArray()) 
//		{
//			if (char_acounts[c - 'a'] == 1) return c;
//		}
//		return '_';
//	}
	
	
	// Way 2 - using HashMap()
//	static char firstNonRepeatingCharacter(String s) 
//	{
//		HashMap<Character, Integer> char_counts = new HashMap<Character, Integer>();
//		
//		for (int i=0; i<s.length(); i++)
//		{
//			char c = s.charAt(i);
//			if (char_counts.containsKey(c))
//			{
//				char_counts.put(c, 1);
//			}
//		}
//		
//		for (int i=0; i<s.length(); i++)
//		{
//			char c = s.charAt(i);
//			System.out.println(c);
//			if (char_counts.get(c) == 1) return c;
//		}
//		return '_';
//	}
	
	
	//Way 1 - not recommended 
//	static char firstNonRepeatingCharacter(String s) 
//	{
//		for (int i=0; i<s.length(); i++)
//		{
//			boolean seenDuplicated = false;
//			for (int j=0; j<s.length(); j++) {
//				if(s.charAt(i) == s.charAt(j) && (i !=j))
//				{
//					seenDuplicated=true;
//					break;
//				}
//			}
//			
//			if (!seenDuplicated) return s.charAt(i);
//		}
//		return '_';		
//	}

}
