package com.service;

import com.*;
import com.enums.Measure;
import com.enums.ProductCategory;

import java.util.Arrays;

public class OperationImpl implements Operation {
    Sugar sugar = new Sugar("Сахар", 100, Measure.KG, ProductCategory.GROATS);
    Milk milk = new Milk("Молоко", 100, Measure.LI, ProductCategory.DAIRY);
    Cream cream = new Cream("Сливки", 100, Measure.LI, ProductCategory.DAIRY);
    Rice rice = new Rice("Рис", 100, Measure.KG, ProductCategory.GROATS);

    Cashier john = new Cashier("John",25);
    Cashier stella = new Cashier("Stella",21);
    Product[] products = {sugar, milk, rice, cream};
    Cashier[]cashiers={john,stella};



    @Override
    public Cashier getCashier(String name) {
        return null;
    }

    @Override
    public Product[] getProductByCategory(String category) {
        Product[] result = new Product[4];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductCategory().equals(ProductCategory.valueOf(category))) {
                result[i] = products[i];
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
    public Product chooseProduct(String name) {

        for (Product item:products) {
            if(name.equals(item.getName())){
                return item;
            }
        }
        return null;
    }

    @Override
    public Cashier getCashierByName(String cashier) {
        for (Cashier item :cashiers ){
            if(cashier.equals(item.getName())){
                return item;
            }
        }
        return null;
    }

    @Override
    public void getCashier() {
        for (Cashier item : cashiers) {
            System.out.println(item.getName());

        }
    }

    @Override
    public Receipt getReceipt(Order order) {

        Receipt receipt=new Receipt();
        Details[] details=order.getDetails();

        double totalSum=0;
        double totalDiscount=0;

        ReceiptDetails[] receiptDetails=new ReceiptDetails[10];

        for (int i=0; i<details.length;i++){
            if(details[i]!=null){

                Product product=details[i].getProduct();

                double cost=product.getCost()*details[i].getAmount();
                double discount=(cost*details[i].getDiscount())/100;
                totalSum=totalSum+(cost-discount);
                totalDiscount=totalDiscount+discount;

                receiptDetails[i]=new ReceiptDetails(product.getName(),cost-discount);
            }
        }

        for (ReceiptDetails item:receiptDetails){
            System.out.println(item);
        }

        receipt.setName(order.getCashier().getName());
        receipt.setTotalDiscount(totalDiscount);
        receipt.setReceiptDetails(receiptDetails);
        receipt.setTotalSum(totalSum);

        return receipt;
    }



    public int getSum(Product[]products){
        int a = 0;
        for (int i = 0; i < products.length; i++) {
            a+=products[i].getCost();
        }
        return a;

    }
}
