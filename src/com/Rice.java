package com;

import com.enums.Measure;
import com.enums.ProductCategory;

public class Rice extends Product{
    public Rice(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }
}
