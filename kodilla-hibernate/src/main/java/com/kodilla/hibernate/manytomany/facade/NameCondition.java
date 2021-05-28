package com.kodilla.hibernate.manytomany.facade;

public class NameCondition {
    public static String nameCondition(String text) {
        return ("%" + text + "%");
    }
}
