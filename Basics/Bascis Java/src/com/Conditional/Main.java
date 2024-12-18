package com.Conditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Please enter a number: ");
        int salary = input.nextInt();

        // Conditional logic to check the value
        if (salary == 10000) {
            System.out.println("The number is positive.");
        } else if (salary == 15000) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is Greater.");
        }

        // Close the Scanner
        input.close();
    }
}
