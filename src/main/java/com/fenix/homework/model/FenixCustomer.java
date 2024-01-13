package com.fenix.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FenixCustomer {
    private String tazId;
    private long id;
    private String telephone;
    private String name;
    private String address;
}
