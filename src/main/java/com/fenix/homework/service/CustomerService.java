package com.fenix.homework.service;

import com.fenix.homework.model.FenixCustomer;
import com.fenix.homework.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public FenixCustomer getCustomer(String tazId) {
        return customerRepository.getCustomer(tazId);
    }

    public void addCustomer(FenixCustomer customer) {
        customerRepository.addCustomer(customer);
    }

    public void updateCustomer(FenixCustomer customer) {
        customerRepository.addCustomer(customer);
    }

    public List<FenixCustomer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
