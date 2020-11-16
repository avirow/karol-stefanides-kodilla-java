package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int result2 = calculator.add(5, 3);

        if (result2 == 8)
        {
            System.out.println("Test OK");
        }
        else
        {
            System.out.println("Error pierwszego testu jednostkowego");
        }

        System.out.println("Test - drugi test jednostkowy:");
        int result3 = calculator.substract(5, 3);

        if (result3 == 2)
        {
            System.out.println("Test OK");
        }
        else
        {
            System.out.println("Error pierwszego testu jednostkowego");
        }
    }
}
