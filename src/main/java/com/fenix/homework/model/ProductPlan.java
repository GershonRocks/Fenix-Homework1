package com.fenix.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONObject;

@Data
@AllArgsConstructor
public class ProductPlan {
    private long id;
    private String planName;
    private JSONObject settings;
}
