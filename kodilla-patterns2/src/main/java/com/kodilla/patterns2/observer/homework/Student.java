package com.kodilla.patterns2.observer.homework;

public class Student {
    private String firstName;
    private String lastName;
    private HomeworkTaskQueue homeworkTaskQueue;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        homeworkTaskQueue = new HomeworkTaskQueue(this);
    }

    public void addTask(HomeworkTask task) {
        homeworkTaskQueue.addHomeworkTask(task);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public HomeworkTaskQueue getHomeworkTasksQueue() {
        return homeworkTaskQueue;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}
