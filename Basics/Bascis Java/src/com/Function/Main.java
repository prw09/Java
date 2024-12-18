package com.Function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        greeting();
//        int ans = summingNumbers();
//        System.out.println("Sum of numbers: " + ans);

//        float ans = getNumbers();
//        System.out.println("Sum of numbers: " + ans);

//          String ans = message();
//          System.out.println(ans);

//          int ans = sumOfNumbers(53,56);
//          System.out.println(ans);

//            int result = votingRight(45);
//            System.out.println(result);

//            RandomNumber();

        swap(23,65);
    }

    static void greeting() {
        System.out.println("Hello");
    }

    static int summingNumbers() {

        int num1, num2, sum;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = input.nextInt();
        System.out.print("Enter num2: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        return sum;
    }

    static float getNumbers() {

        float number1, number2, number3;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number1: ");
        number1 = in.nextFloat();
        System.out.println(number1);

        System.out.println("Enter number2: ");
        number2 = in.nextFloat();
        System.out.println(number2);

        System.out.println("Enter number3: ");
        number3 = in.nextFloat();
        System.out.println(number3);

        return number1 + number2 + number3;
    }

    static String message(){

        String greet = "Welcome to this lecture";
        return greet;
    }

    static int sumOfNumbers(int a , int b){

        int sum = a + b;
        return sum;

    }

    static int votingRight(int age){

        if (age < 18){
            System.out.println("Not Eligible for vote");
        }

        else {
            System.out.println("Eligible for vote");
        }

        return age;
    }

//    Scope

    static void RandomNumber(){
        int num = 87;
//      you cannot access in this outside
        System.out.println(num);

    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

}
