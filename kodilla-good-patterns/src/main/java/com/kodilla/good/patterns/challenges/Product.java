package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;

    public Product(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return  productName ;
    }
}

