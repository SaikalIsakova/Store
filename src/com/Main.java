package com;

import com.service.Operation;
import com.service.OperationImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Operation operation = new OperationImpl();
        System.out.println("Добро пожаловать!");
        System.out.println("Выберите категорию.");
        operation.getCategory();
        String category=sc.next();
        operation.getProductByCategory(category);

        System.out.println("Выберите продукт");
        String chooseProduct = sc.next();
        operation.chooseProduct(chooseProduct);

    }
}