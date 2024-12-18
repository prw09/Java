package com.AtmMachine;

import java.util.Scanner;

public class Atm {
    float balance;
    int pin = 3302;

    public void CheckPin(){
        System.out.println("Enter Your Pin!");
        Scanner in = new Scanner(System.in);
        int enterPin = in.nextInt();

        if(pin == enterPin){
            Menu();
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
    public void Menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance:");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1){
            CheckBalance();
        } else if (option ==2) {
            WithdrawMoney();
        }
        else if(option == 3){
            Deposit();
        }
        else if(option == 4){
            return;
        }
        else{
            System.out.println("Enter a Valid choice");
        }
    }

    public void CheckBalance(){
        System.out.println("Balance: " + balance);
        Menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter the withdraw amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Money Withdraw Successfully");
        }
        Menu();
    }

    public void Deposit(){
        System.out.println("Enter the amount you want to deposit");
        Scanner sc = new Scanner(System.in);
        float depositMoney = sc.nextFloat();
        balance += depositMoney;
        System.out.println("Money Deposited");

        Menu();
    }

    public static void main(String[] args) {

        Atm atm = new Atm();
        atm.CheckPin();

    }

}

