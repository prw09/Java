package com.Array;

public class Maximum {
    public static void main(String[] args) {

        int[] num = {3,5,8,10,11,87,111,345};
        int ans = maxRange(num, 2,8);
        System.out.println(ans);

    }

    static int max(int[] arr){
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] == 0){
                return -1;
            }

            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    static int maxRange(int[] arr, int start, int end){

        if(start > end){
            return -1;
        }

        if(arr == null){
            return -2;
        }

        if(start == end){
            return start;
        }

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}
