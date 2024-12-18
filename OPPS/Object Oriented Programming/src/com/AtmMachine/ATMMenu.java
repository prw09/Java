package com.AtmMachine;

import java.util.Scanner;

public class ATMMenu {
    private final ATMOperations atmOperations = new ATMOperations();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter Your Choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    atmOperations.checkBalance();
                    break;
                case 2:
                    atmOperations.withdrawMoney();
                    break;
                case 3:
                    atmOperations.depositMoney();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
