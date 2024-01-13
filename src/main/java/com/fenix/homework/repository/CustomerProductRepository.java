package com.fenix.homework.repository;

import com.fenix.homework.model.CustomerProducts;
import com.fenix.homework.model.FenixCustomer;
import com.fenix.homework.model.Product;
import com.fenix.homework.model.ProductPlan;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerProductRepository {

    private CustomerRepository customerRepository;

    private Map<FenixCustomer, CustomerProducts> customerProductsRepo;

    @Autowired
    public CustomerProductRepository(CustomerRepository customerRepository) {
        this.customerProductsRepo = new HashMap<>();
        Map<String, Product> sampleProducts = new HashMap<>();
        sampleProducts.put("1G", new Product(1L, new ProductPlan(1L,"plan1", new JSONObject()), "1G", "5G"));
        sampleProducts.put("2G", new Product(2L, new ProductPlan(2L,"plan2", new JSONObject()), "2G", "5G"));
        FenixCustomer customer1 = customerRepository.getCustomer("123456");
        CustomerProducts customerProducts1 = new CustomerProducts(1L, customer1, new HashMap<>());
        customerProducts1.addProduct(sampleProducts.get("1G"));
        customerProductsRepo.put(customer1, customerProducts1);
        FenixCustomer customer2 = customerRepository.getCustomer("1234567");
        CustomerProducts customerProducts2 = new CustomerProducts(2L, customer1, new HashMap<>());
        customerProducts1.addProduct(sampleProducts.get("2G"));
        customerProductsRepo.put(customer2, customerProducts2);
    }

    public CustomerProducts getCustomerProducts(String tazId) {
        return customerProductsRepo.get(tazId);
    }

    public void addProductToCustomer(String tazId, CustomerProducts customerProducts) {
        customerProductsRepo.put(customerRepository.getCustomer(tazId), customerProducts);
    }

    public void updateProductToCustomer(String tazId, CustomerProducts customerProducts) {
        customerProductsRepo.put(customerRepository.getCustomer(tazId), customerProducts);
    }
}
