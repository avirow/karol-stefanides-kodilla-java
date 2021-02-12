package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private  List<String> task;

    public TaskList(){
        this.task = new ArrayList<>();
    }

    public List<String> getTasksList() {
        return task;
    }
}
