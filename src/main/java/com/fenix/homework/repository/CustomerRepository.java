package com.fenix.homework.repository;

import com.fenix.homework.model.FenixCustomer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CustomerRepository {
    private Map<String, FenixCustomer> customers;

    public CustomerRepository() {
        customers = new HashMap<>();
        customers.put("123456", new FenixCustomer("123456", 1, "0586996123", "Gershon-Avital", "Beer-Sheva"));
        customers.put("1234567", new FenixCustomer("1234567", 1, "0586996124", "Danny-Avital", "Tel-Aviv"));
    }

    public CustomerRepository init() {
        return new CustomerRepository();
    }

    public FenixCustomer getCustomer(String tazId) {
        return customers.get(tazId);
    }

    public void addCustomer(FenixCustomer newCustomer) {
        FenixCustomer existingTaz = customers.get(newCustomer.getTazId());
        // update existing customer details
        if(existingTaz != null) {
            existingTaz.setName(newCustomer.getName());
            existingTaz.setTelephone(newCustomer.getTelephone());
            existingTaz.setAddress(newCustomer.getAddress());
        } else {
            customers.put(newCustomer.getTazId(), new FenixCustomer(newCustomer.getTazId(), newCustomer.getId(), newCustomer.getTelephone(), newCustomer.getName(), newCustomer.getAddress()));
        }
    }

    public List<FenixCustomer> getAllCustomers() {
        return customers.values().stream().collect(Collectors.toList());
    }
}
