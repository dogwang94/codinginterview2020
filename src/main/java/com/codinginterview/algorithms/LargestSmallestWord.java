package com.codinginterview.algorithms;

/**
 * @author Liping.Wang
 * Given a String, write a program to find largest and smallest word in it.
 * Approach: Do a single traversal and keep track of longest ad smallest words using word lengths.
 */
public class LargestSmallestWord 
{
	public static void findWords(String input){
        if(input==null)
            return;

        String [] words = input.split(" ");
        int smallestWordLen = Integer.MAX_VALUE;
        int largestWordLen = 0;
        String smallestWord = "";
        String largestWord = "";
        for (int i = 0; i <words.length ; i++) {
            String word = words[i];
            int len = word.length();
            if(len>largestWordLen){
                largestWordLen = len;
                largestWord = word;
            }
            if(len<smallestWordLen) {
                smallestWordLen = len;
                smallestWord = word;
            }
        }
        System.out.println("Input String: " + input);
        System.out.println("Smallest Word: " + smallestWord);
        System.out.println("Largest Word: " + largestWord);
    }

    public static void main(String[] args) {
        String input = "test";
        findWords(input);
        System.out.println("------------------");
        input = "This problem is solved at Algorithms tutorial horizon";
        findWords(input);
    }
}
