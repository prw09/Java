package com.AtmMachine;

import java.util.Scanner;

public class ATMS {
    private final int pin = 3302;

    public void checkPin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Pin: ");
        int enteredPin = in.nextInt();

        if (pin == enteredPin) {
            ATMMenu menu = new ATMMenu();
            menu.displayMenu();
        } else {
            System.out.println("Invalid Pin. Try Again.");
        }
    }
}
