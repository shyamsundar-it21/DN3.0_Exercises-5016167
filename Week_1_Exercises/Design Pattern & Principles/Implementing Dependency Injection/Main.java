package com.example;

import com.example.config.AppConfig;
import com.example.model.Customer;
import com.example.service.CustomerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AppConfig appConfig = new AppConfig();
        CustomerService customerService = appConfig.createCustomerService();

        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Find Customer by ID");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter customer ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();

                Customer customer = new Customer(id, name);
                customerService.addCustomer(customer);
                System.out.println("Customer added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter customer ID: ");
                int id = scanner.nextInt();

                Customer customer = customerService.getCustomerById(id);
                if (customer != null) {
                    System.out.println("Customer ID: " + customer.getId());
                    System.out.println("Customer Name: " + customer.getName());
                } else {
                    System.out.println("Customer not found.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
