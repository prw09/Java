package com.Array;

import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(15);

//        list.add(34);
//        list.add(21);
//        list.add(87);
//        list.add(67);

        for (int nums = 0; nums < 6; nums++) {
            list.add(nums);
            System.out.print(list);
        }
    }
}
