package com;

import java.util.Arrays;

public class Order {
    private Cashier cashier;
    private Details[]details;

    public Order() {
    }

    public Order(Cashier cashier, Details[] details) {
        this.cashier = cashier;
        this.details = details;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Details[] getDetails() {
        return details;
    }

    public void setDetails(Details[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return
                "Кассир : " + cashier +
                ", Заказ : " + Arrays.toString(details);
    }
}
