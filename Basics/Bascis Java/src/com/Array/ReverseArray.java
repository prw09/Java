package com.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2,4,6,7,9};
//        reverse(arr);
//        System.out.print(Arrays.toString(arr));

        reverseBruteForce(arr);
        System.out.print(Arrays.toString(arr));
    }

    static int[] reverseBruteForce(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n]; // Create a new array to store the reversed elements

        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1]; // Copy elements in reverse order
        }

        return reversed; // Return the reversed array
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start ++;
            end --;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
