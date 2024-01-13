package com.fenix.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class CustomerProducts {
    private long id;
    private FenixCustomer customer;
    private Map<String, Product> products;

    public void addProduct(Product product) {
        updateProduct(product);
    }

    public void updateProduct(Product product) {
        products.put(product.getName(), product);
    }
}
