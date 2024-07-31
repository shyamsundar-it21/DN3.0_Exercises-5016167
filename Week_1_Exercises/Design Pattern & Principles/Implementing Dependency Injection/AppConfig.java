package com.example.config;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;

public class AppConfig {
    public CustomerService createCustomerService() {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        return new CustomerService(customerRepository);
    }
}
