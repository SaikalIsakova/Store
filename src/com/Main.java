package com;

import com.service.Operation;
import com.service.OperationImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Operation operation = new OperationImpl();
        int count = 0;
        int answer=0;
        System.out.println("Добро пожаловать!");
        Details[]details=new Details[4];

        while(answer!=1) {
            System.out.println("Выберите категорию.");
            operation.getCategory();
            String category = sc.next();
            Product[] products = new Product[0];
            try {
                products = operation.getProductByCategory(category);
            } catch (Exception e) {
                System.out.println("Введите правильно категории!");
                continue;
            }
            for (Product product : products) {
                if (product != null)
                    product.getInfo();
            }

            System.out.println("Выберите продукт :");

            String chooseProduct = sc.next();
            Product product = operation.chooseProduct(chooseProduct);

            int amount;
            while (true) {
                System.out.println("Количество выбранного продукта :");
                try{
                    amount=Integer.valueOf(sc.next());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Введите правильные данные!");
                }
            }

            System.out.println("Размер скидки в %");
            double discount = sc.nextDouble();

            Details detail = new Details(product, amount, discount);
            details[count] = detail;

            System.out.println("Продолжим? Если да то 0,если нет то 1");
            answer = sc.nextInt();
            count++;
        }
        for (Details item:details) {
            if(item!=null){
                System.out.println(item);
            }
        }

        System.out.println("Выберите кассира : ");
        operation.getCashier();
        String cashier=sc.next();
        Cashier res=operation.getCashierByName(cashier);

        Order order=new Order();
        order.setDetails(details);
        order.setCashier(res);

        System.out.println(order);


        Receipt receipt=operation.getReceipt(order);
        System.out.println(receipt);
    }
}