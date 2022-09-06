package com.enums;

public enum ProductCategory {
    DAIRY("Молочные"),
    GROATS("Крупы");

    private String name;

    public String getName() {
        return name;
    }

    ProductCategory(String name) {
        this.name = name;
    }
}
