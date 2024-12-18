//package com.code;
//
//import java.util.*;
//
//// Abstract Base Class for Payment
//abstract class Payment {
//    protected String upiId;
//    protected double amount;
//
//    public Payment(String upiId, double amount) {
//        this.upiId = upiId;
//        this.amount = amount;
//    }
//
//    public abstract void processPayment(); // Abstract Method
//
//    public void commonPaymentLogic() {
//        System.out.println("Performing common payment logic (e.g., transaction logging).\n");
//    }
//}
//
//// Derived Class for Bank Payments
//class BankPayment extends Payment {
//    private String bankName;
//
//    public BankPayment(String upiId, double amount, String bankName) {
//        super(upiId, amount);
//        this.bankName = bankName;
//    }
//
//    @Override
//    public void processPayment() {
//        commonPaymentLogic();
//        System.out.println("Processing bank payment through " + bankName);
//        System.out.println("Debiting Rs." + amount + " from UPI ID: " + upiId);
//    }
//}
//
//// Derived Class for Wallet Payments
//class WalletPayment extends Payment {
//    private String walletName;
//
//    public WalletPayment(String upiId, double amount, String walletName) {
//        super(upiId, amount);
//        this.walletName = walletName;
//    }
//
//    @Override
//    public void processPayment() {
//        commonPaymentLogic();
//        System.out.println("Processing wallet payment through " + walletName);
//        System.out.println("Deducting Rs." + amount + " from wallet linked to UPI ID: " + upiId);
//    }
//}
//
//// Derived Class for QR Payments
//class QRPayment extends Payment {
//    private String merchantName;
//
//    public QRPayment(String upiId, double amount, String merchantName) {
//        super(upiId, amount);
//        this.merchantName = merchantName;
//    }
//
//    @Override
//    public void processPayment() {
//        commonPaymentLogic();
//        System.out.println("Processing QR payment for merchant: " + merchantName);
//        System.out.println("Transferred Rs." + amount + " to merchant via UPI ID: " + upiId);
//    }
//}
//
//// Notification Interface
//interface Notification {
//    void sendNotification(String message);
//}
//
//// SMS Notification
//class SMSNotification implements Notification {
//    @Override
//    public void sendNotification(String message) {
//        System.out.println("[SMS] Notification Sent: " + message);
//    }
//}
//
//// Email Notification
//class EmailNotification implements Notification {
//    @Override
//    public void sendNotification(String message) {
//        System.out.println("[Email] Notification Sent: " + message);
//    }
//}
//
//// Push Notification
//class PushNotification implements Notification {
//    @Override
//    public void sendNotification(String message) {
//        System.out.println("[Push] Notification Sent: " + message);
//    }
//}
//
//// Payment Factory (Using Polymorphism)
//class PaymentFactory {
//    public static Payment createPayment(String type, String upiId, double amount, String extraInfo) {
//        switch (type.toLowerCase()) {
//            case "bank":
//                return new BankPayment(upiId, amount, extraInfo);
//            case "wallet":
//                return new WalletPayment(upiId, amount, extraInfo);
//            case "qr":
//                return new QRPayment(upiId, amount, extraInfo);
//            default:
//                throw new IllegalArgumentException("Invalid payment type");
//        }
//    }
//}
//
//// Transaction Class
//class Transaction {
//    private static int transactionCount = 0;
//    private final int transactionId;
//    private final Payment payment;
//    private final Notification notification;
//
//    public Transaction(Payment payment, Notification notification) {
//        this.transactionId = ++transactionCount;
//        this.payment = payment;
//        this.notification = notification;
//    }
//
//    public void execute() {
//        System.out.println("Executing Transaction ID: " + transactionId);
//        payment.processPayment();
//        notification.sendNotification("Transaction ID " + transactionId + ": Payment of Rs." + payment.amount + " successful.");
//    }
//}
//
//// Main Application
//public class UPIPaymentApplication {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("--- Welcome to UPI Payment Application ---\n");
//
//        System.out.print("Enter your UPI ID: ");
//        String upiId = scanner.nextLine();
//
//        System.out.print("Enter payment amount: ");
//        double amount = scanner.nextDouble();
//        scanner.nextLine(); // Consume newline
//
//        System.out.println("Select payment type: 1. Bank  2. Wallet  3. QR");
//        int choice = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        String paymentType = "";
//        String extraInfo = "";
//
//        switch (choice) {
//            case 1:
//                paymentType = "bank";
//                System.out.print("Enter Bank Name: ");
//                extraInfo = scanner.nextLine();
//                break;
//            case 2:
//                paymentType = "wallet";
//                System.out.print("Enter Wallet Name: ");
//                extraInfo = scanner.nextLine();
//                break;
//            case 3:
//                paymentType = "qr";
//                System.out.print("Enter Merchant Name: ");
//                extraInfo = scanner.nextLine();
//                break;
//            default:
//                System.out.println("Invalid choice.");
//                return;
//        }
//
//        // Create Payment using Factory
//        Payment payment = PaymentFactory.createPayment(paymentType, upiId, amount, extraInfo);
//
//        // Select Notification Type
//        System.out.println("Select notification type: 1. SMS  2. Email  3. Push");
//        int notificationChoice = scanner.nextInt();
//
//        Notification notification;
//        switch (notificationChoice) {
//            case 1:
//                notification = new SMSNotification();
//                break;
//            case 2:
//                notification = new EmailNotification();
//                break;
//            case 3:
//                notification = new PushNotification();
//                break;
//            default:
//                System.out.println("Invalid choice.");
//                return;
//        }
//
//        // Execute Transaction
//        Transaction transaction = new Transaction(payment, notification);
//        transaction.execute();
//
//        System.out.println("\n--- Transaction Completed Successfully ---\n");
//    }
//}
