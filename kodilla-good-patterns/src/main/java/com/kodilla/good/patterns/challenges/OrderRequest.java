package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    User user;
    Address address;
    Product product;

    User getUser(){return user;}
    Address getAddress(){return address;}
    Product getProduct(){return product;}
}
