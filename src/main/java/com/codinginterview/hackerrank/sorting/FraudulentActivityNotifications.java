package com.codinginterview.hackerrank.sorting;

import java.util.Scanner;

/**
 * @author Liping.Wang
 * Function Description
 * Complete the function activityNotifications in the editor below. It must return an integer representing the number of client notifications. 
 * activityNotifications has the following parameter(s):
 * expenditure: an array of integers representing daily expenditures 
 * d: an integer, the lookback days for median spending 
 */
public class FraudulentActivityNotifications 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);



		int n = sc.nextInt();

		int d = sc.nextInt();

		int[] expenditures = new int[5];

		for (int i = 0; i < expenditures.length; i++) {

			expenditures[i] = sc.nextInt();

		}



		System.out.println(activityNotifications(expenditures, d));



		sc.close();

	}
	
	static int activityNotifications(int[] expenditure, int d) 
	{
		int[] counts = new int[201];

		for (int i = 0; i < d; i++) {
			counts[expenditure[i]]++;
		}

		int result = 0;

		for (int i = d; i < expenditure.length; i++) 
		{
			int lower = 0;
			int leftNum = 0;

			while ((leftNum + counts[lower]) * 2 <= d) 
			{
				leftNum += counts[lower];
				lower++;
			}

			int upper = counts.length - 1;

			int rightNum = 0;

			while ((rightNum + counts[upper]) * 2 <= d) 
			{
				rightNum += counts[upper];
				upper--;
			}

			if (expenditure[i] >= lower + upper) 
			{
				result++;
			}

			counts[expenditure[i - d]]--;
			counts[expenditure[i]]++;
		}
		return result;

	}

}
