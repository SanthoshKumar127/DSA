package com.leetcode.Arrays;


import java.util.Arrays;

/**
 * Question : Given an array of size N. The task is to find the maximum and the minimum
 * element of the array using the minimum number of comparisons.
 * https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
public class MinMaxOfAnArray {
    public static Pair getMinMax(int[] arr, int size) {
        Pair minMax = new Pair();
        /**
         * Simple way is to Sort the Array Min = arr[0] and Max = arr[size-1];
         *Arrays.sort(arr);
         *         minMax.min = arr[0];
         *         minMax.max = arr[size-1];
         *         return minMax;
         */
        minMax.max = Integer.MIN_VALUE;
        minMax.min = Integer.MAX_VALUE;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > minMax.max)
                minMax.max = arr[i];
            else if (arr[i] < minMax.min)
                minMax.min = arr[i];
        }

        return minMax;
        //Time Complexity = O(n)
    }
}
