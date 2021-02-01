package com.kodilla.good.patterns.challenges.food2door;

public class User {
    private String firstName;
    private String lastName;
    private String adress;

    public User(String firstName, String lastName, String adress, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }
}
