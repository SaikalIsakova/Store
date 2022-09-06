package com.service;

import com.Cashier;
import com.Product;

public interface Operation {

//    Receipt getReceipt(Order order);
    Cashier getCashier(String name);
    Product[]getProductByCategory(String category);
    void getCategory();
    void chooseProduct(String name);
}
