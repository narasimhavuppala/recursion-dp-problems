package com.recursion.basic;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Before swapping or reversing:"+ Arrays.toString(arr));

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("After swapping or reversing:::"+Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;  //base condition
        //swap
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;

        //increment left and decrement right
        //call the recursive call
        reverseArray(arr, ++left, --right);
    }

}
