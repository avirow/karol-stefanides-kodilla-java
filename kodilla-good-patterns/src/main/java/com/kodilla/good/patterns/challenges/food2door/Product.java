package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantityAfterSale(int volumeOfPurchase) {
        this.quantity = quantity-volumeOfPurchase;
    }

    @Override
    public String toString() {
        return "Nazwa produktu " + name +
                ", cena " + price +
                ", ilość " + quantity;
    }
}
