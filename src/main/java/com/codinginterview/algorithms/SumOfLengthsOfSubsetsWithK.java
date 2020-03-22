package com.codinginterview.algorithms;

import java.util.Arrays;

/**
 * @author Liping.Wang
 * Objective: Given an array of numbers and integer K. 
 * Your task is to find lengths of all the subsets which contain value K and all elements in the subset are less than equal to K.
 */
public class SumOfLengthsOfSubsetsWithK 
{
    public static void sumOfLengthsOfSubsetsWithK(int [] input, int k)
    {
        System.out.println("Given Input: " + Arrays.toString(input) + ", and K = " + k);
        
        int currentLength = 0;
        int answer = 0;
        boolean kPresent = false;
        for (int i = 0; i <input.length ; i++) {
            int current = input[i];
            if (current <= k) {
                currentLength++;
                if(current==k)
                    kPresent = true;
            } else {
                if(kPresent)
                    answer +=currentLength;
                //reset
                kPresent = false;
                currentLength = 0;
            }
        }

        //for last elements (if less than k)
        if(kPresent)
            answer +=currentLength;
        System.out.print("Length of subsets(all elements <= k) which contains K: " + answer);
    }

    public static void main(String[] args) {
        int input[] = {1, 5, 2, 3, 8, 6, 2, 4, 9, 5, 2};
        int k = 9;
        sumOfLengthsOfSubsetsWithK(input, k);
    }

}
