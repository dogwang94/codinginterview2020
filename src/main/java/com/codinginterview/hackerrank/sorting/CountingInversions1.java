package com.codinginterview.hackerrank.sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CountingInversions1 
{
    static long count = 0;
    
    static void merge(int[] arr, int low, int mid, int high) {
        int leftArraySize = mid - low + 1;
        int rightArraySize = high - mid;

        int[] left = Arrays.copyOfRange(arr, low, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, high + 1);

        int cursorLeft = 0;
        int cursorRight = 0;
        int arrCursor = low;

        boolean isCounting = false;
        int lastLeftItemForWhichWeCounted = -1;
        while (cursorLeft < leftArraySize && cursorRight < rightArraySize) {
            if (left[cursorLeft] <= right[cursorRight]) {
                if (isCounting || (lastLeftItemForWhichWeCounted != -1 && left[cursorLeft] >= lastLeftItemForWhichWeCounted)) {
                    count += cursorRight;
                    isCounting = false;
                }
                arr[arrCursor] = left[cursorLeft];
                cursorLeft++;
            } else {
                arr[arrCursor] = right[cursorRight];

                if (!isCounting) {
                    isCounting = true;
                    lastLeftItemForWhichWeCounted = left[cursorLeft];
                }

                cursorRight++;
            }
            arrCursor++;
        }

        while (cursorLeft < leftArraySize) {
            arr[arrCursor] = left[cursorLeft];

            count += rightArraySize;

            cursorLeft++;
            arrCursor++;
        }

        while (cursorRight < rightArraySize) {
            arr[arrCursor] = right[cursorRight];
            cursorRight++;
            arrCursor++;
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static long countInversions(int[] arr) {
        count = 0;
        mergeSort(arr, 0, arr.length - 1);
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        //System.setIn(new FileInputStream(System.getProperty("user.home") + "/" + "in4.txt"));

        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        long[] answers = new long[d];
        for (int i = 0; i < d; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            long ans = countInversions(arr);
            answers[i] = ans;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) + " ms");

        /* Verify Results */
        Scanner resultScanner = new Scanner(new FileInputStream(System.getProperty("user.home") + "/" + "expected4.txt"));
        int cursor = 0;
        boolean correct = true;
        for (int i = 0; i < d; i++) {
            long expected = resultScanner.nextLong();
            if (expected != answers[i]) {
                System.out.println("Expected " + expected + " got " + answers[i]);
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.println("Correct");
        } else {
            System.out.println("Error");
        }
    }
}
