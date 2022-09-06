package com;

import com.enums.Measure;
import com.enums.ProductCategory;

public class Cream extends Product{
    public Cream(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }
}
