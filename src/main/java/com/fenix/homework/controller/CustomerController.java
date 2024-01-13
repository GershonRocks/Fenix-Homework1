package com.fenix.homework.controller;

import com.fenix.homework.model.FenixCustomer;
import com.fenix.homework.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "getCustomer/{tazId}", method = RequestMethod.GET)
    public FenixCustomer getCustomer(@PathVariable("tazId") String tazId) {
        return customerService.getCustomer(tazId);
    }

    @RequestMapping(value = "addCustomer", method = RequestMethod.POST)
    public void addCustomer(@RequestBody FenixCustomer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(value = "updateCustomer", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody FenixCustomer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(value = "getAllCustomers", method = RequestMethod.GET)
    public List<FenixCustomer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
