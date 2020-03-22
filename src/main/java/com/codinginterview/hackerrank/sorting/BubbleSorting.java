package com.codinginterview.hackerrank.sorting;

public class BubbleSorting {

	public static void main(String[] args) 
	{
		BubbleSorting ob = new BubbleSorting(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        //BubbleSorting.countSwaps(arr); 
        BubbleSorting.countSwaps(arr, arr.length); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 

	/* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    
    static void countSwaps(int arr[], int n) 
    {
    	int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
    }
    
    
  
	// way 1
//	static void countSwaps(int arr[]) 
//    { 
//        int n = arr.length; 
//        for (int i = 0; i < n-1; i++) 
//            for (int j = 0; j < n-i-1; j++) 
//                if (arr[j] > arr[j+1]) 
//                { 
//                    // swap arr[j+1] and arr[i] 
//                    int temp = arr[j]; 
//                    arr[j] = arr[j+1]; 
//                    arr[j+1] = temp; 
//                } 
//    } 

}
