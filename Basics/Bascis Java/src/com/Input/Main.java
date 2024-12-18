package com.Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // Pass System.in to the Scanner constructor
//       System.out.println("Please Enter the Number: ");
//       int roll_num = input.nextInt();
//       System.out.println("You roll number is: " + roll_num);
//       input.close();

//       String name = input.nextLine();
//       System.out.println(name);

//       float marks = input.nextFloat();
//       System.out.println(marks);

        byte num = input.nextByte();
        System.out.println(num);
    }
}
