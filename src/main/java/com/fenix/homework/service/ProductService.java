package com.fenix.homework.service;

import com.fenix.homework.model.CustomerProducts;
import com.fenix.homework.model.Product;
import com.fenix.homework.repository.CustomerProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private CustomerProductRepository customerProductRepository;

    public CustomerProducts getCustomerProduct(String tazId) {
        return customerProductRepository.getCustomerProducts(tazId);
    }

    public void addProductToCustomer(String tazId, CustomerProducts customerProducts) {
        customerProductRepository.addProductToCustomer(tazId, customerProducts);
    }

    public void updateProductToCustomer(String tazId, CustomerProducts customerProducts) {
        customerProductRepository.updateProductToCustomer(tazId, customerProducts);
    }
}
