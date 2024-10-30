package com.recursion.basic;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};


        int sumOfArray=sumOfArray(arr, 0, arr.length );

        System.out.println("Sum Of Array:::"+sumOfArray);

    }

    public static int  sumOfArray(int[] arr, int left, int maxLegth) {
        if (left >= maxLegth) return 0;  //base condition
        //swap
         return arr[left]+ sumOfArray(arr, ++left, maxLegth);
    }
}
