package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList taskToDoList, TaskList taskInProgressLists, TaskList taskDoneList) {
        this.toDoList = taskToDoList;
        this.inProgressList = taskInProgressLists;
        this.doneList = taskDoneList;
    }
    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
