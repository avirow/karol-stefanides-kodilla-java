package com.kodilla.good.patterns.challenges;

public class Address {
    public String address;

    public Address(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return  address ;
    }
}
