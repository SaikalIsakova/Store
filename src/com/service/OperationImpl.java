package com.service;

import com.*;
import com.enums.Measure;
import com.enums.ProductCategory;

import java.util.Arrays;

public class OperationImpl implements Operation {

    Sugar sugar = new Sugar("Сахар", 70, Measure.KG, ProductCategory.GROATS);
    Milk milk = new Milk("Молоко", 75, Measure.LI, ProductCategory.DAIRY);

    Cream cream = new Cream("Сливки", 120, Measure.LI, ProductCategory.DAIRY);
    Rice rice = new Rice("Рис", 150, Measure.KG, ProductCategory.GROATS);

    Product[] products = {sugar, milk, rice, cream};

    @Override
    public Cashier getCashier(String name) {
        return null;
    }

    @Override
    public Product[] getProductByCategory(String category) {
        Product[] result = new Product[10];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductCategory().equals(ProductCategory.valueOf(category))) {
                result[i] = products[i];
                System.out.println(result[i]);
            }
        }
        return result;
    }

    @Override
    public void getCategory() {
        for (ProductCategory item : ProductCategory.values()) {
            System.out.println(item.name());

        }
    }

    @Override
    public void chooseProduct(String name) {

        for (int i = 0; i < products.length; i++) {
            if(products[i].getName().equals(name))
                System.out.println(products[i]);
        }
    }
}
