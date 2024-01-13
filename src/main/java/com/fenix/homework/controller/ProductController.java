package com.fenix.homework.controller;

import com.fenix.homework.model.CustomerProducts;
import com.fenix.homework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("getCustomerProducts/{tazId}")
    public CustomerProducts getCustomerProducts(@PathVariable("tazId") String tazId) {
        return productService.getCustomerProduct(tazId);
    }

    @RequestMapping(value = "addProductToCustomer/{tazId}", method = RequestMethod.POST)
    public void addProductToCustomer(@PathVariable("tazId") String tazId, @RequestBody CustomerProducts customerProducts) {
        productService.addProductToCustomer(tazId, customerProducts);
    }

    @RequestMapping(value = "updateProductsForCustomer/{tazId}", method = RequestMethod.PUT)
    public void updateProductToCustomer(@PathVariable("tazId") String tazId, @RequestBody CustomerProducts customerProducts) {
        productService.updateProductToCustomer(tazId, customerProducts);
    }
}
