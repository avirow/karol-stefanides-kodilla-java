package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String DRIVING_TASK = "DRIVINGTASK";
    public final static String SHOPPING_TASK = "SHOPPINGTASK";
    public final static String PAINTING_TASK = "PAINTNGTASK";


    public final Task generateTask(final String newTask) {

        switch (newTask) {
            case DRIVING_TASK:
                return new DrivingTask("Delegation", "Katowice", "Chevrollet Camaro");
            case SHOPPING_TASK:
                return new ShoppingTask("Ramen", "Shitake", 10.5);
            case PAINTING_TASK:
                return new PaintingTask("Bob Ross", "Titanium White", "Sunshine");
            default:
                throw new IllegalArgumentException("Wrong task name");
        }
    }
}
