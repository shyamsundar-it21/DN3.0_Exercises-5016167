package com.example;

import com.example.context.PaymentContext;
import com.example.strategy.CreditCardPayment;
import com.example.strategy.PayPalPayment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext paymentContext = new PaymentContext();

        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter Card Holder Name: ");
                String cardHolderName = scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();
                System.out.print("Enter Expiry Date (MM/YY): ");
                String expiryDate = scanner.nextLine();

                paymentContext.setPaymentStrategy(new CreditCardPayment(cardNumber, cardHolderName, cvv, expiryDate));
                break;

            case 2:
                System.out.print("Enter PayPal Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter PayPal Password: ");
                String password = scanner.nextLine();

                paymentContext.setPaymentStrategy(new PayPalPayment(email, password));
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        paymentContext.pay(amount);

        scanner.close();
    }
}
