package com;

import com.enums.Measure;
import com.enums.ProductCategory;

public class Milk extends Product {
    public Milk(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }
}
