package com.codinginterview.hackerrank.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.Spring;

public class ValidString {

	public static void main(String[] args) 
	{
		String s = "abcdefghhgfedecba";
		System.out.println(isValid(s));
		
	}


	
	static String isValid(String s) 
	{
		final String GOOD = "YES";
	    final String BAD = "NO";

	    if(s.isEmpty()) return BAD;
	    if(s.length() <= 3) return GOOD;

	    int[] letters = new int[26];
	    for(int i = 0; i < s.length(); i++){
	        letters[s.charAt(i) - 'a']++;
	    }
	    Arrays.sort(letters);
	    int i=0;
	    while(letters[i]==0){
	        i++;
	    }
	    //System.out.println(Arrays.toString(letters));
	    int min = letters[i];   //the smallest frequency of some letter
	    int max = letters[25]; // the largest frequency of some letter
	    String ret = BAD;
	    if(min == max) ret = GOOD;
	    else{
	        // remove one letter at higher frequency or the lower frequency 
	        if(((max - min == 1) && (max > letters[24])) ||
	            (min == 1) && (letters[i+1] == max))
	            ret = GOOD;
	    }
	    return ret;
	}
		
}	
	// Way to use Stream API
//	static String isValidForJava8(String s) 
//	{
//
//	    Stream<String> stream = Stream.of(s.split(""));
//
//	    Map<String, Long> map = stream.collect(
//	            Collectors.groupingBy( Function.identity(), Collectors.counting() ));
//
//	    Long min = map.values().stream().min(Long::compareTo).get();
//	    Long max = map.values().stream().max(Long::compareTo).get();
//
//	    if(min == max) { return "YES";} 	//all frequencies equal
//	    if( (max - min) > 1) {return "NO";} 	//removing one character can not make the equal
//
//	    //for other cases make sure that only one frequency is different
//	    int countBiggerThanMin = map.values().stream().mapToInt(v -> (v > min) ? 1 : 0).sum();
//
//	    if((countBiggerThanMin == 1) || //only one bigger than min
//	            (countBiggerThanMin == (map.size() - 1))) { //min is samller than all others
//	        return "YES";
//	    }
//	    return "NO";
//	}


