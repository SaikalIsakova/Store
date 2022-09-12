package com.service;

import com.*;

public interface Operation {

    Receipt getReceipt(Order order) ;
    Cashier getCashier(String name);
    Product[]getProductByCategory(String category)throws Exception;
    void getCategory();
    void getCashier();
   Product chooseProduct(String name);
    Cashier getCashierByName(String cashier);
}
