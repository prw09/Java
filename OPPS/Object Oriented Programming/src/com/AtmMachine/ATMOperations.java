package com.AtmMachine;

import java.util.Scanner;

public class ATMOperations {
    private float balance;

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdraw amount: ");
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Money Withdrawn Successfully");
        }
    }

    public void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money Deposited Successfully");
    }
}
