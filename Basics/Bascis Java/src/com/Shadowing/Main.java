package com.Shadowing;

public class Main {
    static int number = 0;

    public static void main(String[] args) {

        System.out.println(fun());
    }

    private static int fun() {
        number = 34;
        return number;
    }


}
