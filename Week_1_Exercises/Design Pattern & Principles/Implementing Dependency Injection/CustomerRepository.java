package com.example.repository;

import com.example.model.Customer;

public interface CustomerRepository {
    Customer findCustomerById(int id);
    void addCustomer(Customer customer);
}
