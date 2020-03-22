package com.codinginterview.google;

import java.util.HashMap;

/**
 * @author Liping.Wang
 * Better approach
	. Iterate the string from left to right.
	. Count the occurrence of each character and store it in a map.
	. Iterate the string again from left to right and check if the character has count more than one in the map created in the previous step, 
	if yes then return that character.
	. If none of the character has count > 1 in map, return null.
	. Time complexity is O(N) and Space Complexity is O(N).
 */

public class FirstRecurringCharacter {

	public static void main(String[] args) 
	{
		String input = "horizon";
        Character result = getCharacter(input);
        if(result!=null){
            System.out.println("First Repeating Character in '"+input+"' is: " + result);
        }else{
            System.out.println("No Repeating Character found");
        }
    }

	
	public static Character getCharacter(String input){
        //remove all the spaces
        input = input.replaceAll(" ", "");
        Character rptChar = null;
        //Will store each character and it's count
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i <input.length(); i++) {
            Character chr = input.charAt(i);
            if(map.containsKey(chr)){
                map.put(chr,map.get(chr)+1);
            }else{
                map.put(chr, 1);
            }
        }
        //Iterate the string and return the character for which the count is > 1 in map
        for (int i = 0; i <input.length() ; i++) {
            if(map.get(input.charAt(i))>1){
                rptChar = input.charAt(i);
                break;
            }
        }
        return rptChar;
    }

}
