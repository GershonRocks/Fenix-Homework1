package com.fenix.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private long id;
    private ProductPlan productPlan;
    private String name;
    private String marketType;
}
