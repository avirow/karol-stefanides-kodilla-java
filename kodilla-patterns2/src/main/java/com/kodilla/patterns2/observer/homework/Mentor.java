package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String firstName;
    private String lastName;
    private int quantityOfActualTasks;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        quantityOfActualTasks = 0;
    }

    @Override
    public void update(HomeworkTaskQueue homeworkTaskQueue) {
        System.out.println("There is a new task from student " + homeworkTaskQueue.getStudent() +
                "\n" + homeworkTaskQueue.getHomeworkTasks().get(homeworkTaskQueue.getHomeworkTasks().size() - 1));
        quantityOfActualTasks++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getQuantityOfActualTasks() {
        return quantityOfActualTasks;
    }
}
