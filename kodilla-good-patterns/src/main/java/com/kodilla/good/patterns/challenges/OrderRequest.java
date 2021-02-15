package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    User user;
    Address address;
    Product product;

    public OrderRequest(User user, Product product, Address address){
        this.user = user;
        this.product = product;
        this.address = address;
    }

    User getUser(){return user;}
    Address getAddress(){return address;}
    Product getProduct(){return product;}
}
