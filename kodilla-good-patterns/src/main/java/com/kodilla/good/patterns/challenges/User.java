package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  name + ' ' + lastName ;
    }
}
