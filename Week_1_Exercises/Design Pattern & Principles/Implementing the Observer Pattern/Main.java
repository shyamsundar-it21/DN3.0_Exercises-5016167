package com.example;

import com.example.observer.MobileApp;
import com.example.observer.Observer;
import com.example.observer.WebApp;
import com.example.subject.StockMarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mobile App name: ");
        String mobileAppName = scanner.nextLine();
        Observer mobileApp = new MobileApp(mobileAppName);

        System.out.print("Enter Web App name: ");
        String webAppName = scanner.nextLine();
        Observer webApp = new WebApp(webAppName);

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        while (true) {
            System.out.print("Enter new stock price (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double stockPrice = Double.parseDouble(input);
                stockMarket.setStockPrice(stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.deregisterObserver(webApp);

        scanner.close();
    }
}
