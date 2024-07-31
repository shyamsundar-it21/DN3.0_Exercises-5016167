package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }

    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }
}
