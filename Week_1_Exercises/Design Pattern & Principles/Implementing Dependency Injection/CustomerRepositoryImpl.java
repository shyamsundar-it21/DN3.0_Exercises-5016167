package com.example.repository;

import com.example.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private final Map<Integer, Customer> customerDatabase = new HashMap<>();

    @Override
    public Customer findCustomerById(int id) {
        return customerDatabase.get(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDatabase.put(customer.getId(), customer);
    }
}
