package com.Array;

public class Objects {
    public static void main(String[] args) {
//        int [] numbs = {3,4,5, 12};
//        System.out.println(Arrays.toString(numbs));
//        Change(numbs);
//        System.out.println(Arrays.toString(numbs));

//        int [][] numbers = new int[3][];

        int[][] numbers = {
            {1,2,3},
            {3,7,8},
            {9,1,4}
        };

//        System.out.println();

        int[][] arr = {
                {1,2,6,7},
                {2,5,7},
                {9,0,2}
        };

        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void Change(int[] arrays){
        arrays[0] = 99;
    }


}
