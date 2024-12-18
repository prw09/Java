package com.Shadowing;

public class Overloading {
    public static void main(String[] args) {
        fun("edin");
        fun(34);
    }

    static void fun(int num){
        System.out.println(num);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
