package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    
    @Test
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When

        Board board = (Board)context.getBean("getBoard");

        ArrayList<String> taskToDoList = (ArrayList)board.getToDoList().getTasksList();
        taskToDoList.add("First task add to list");

        ArrayList<String> taskInProgressList = (ArrayList)board.getInProgressList().getTasksList();
        taskInProgressList.add("Second task in progress");

        ArrayList<String> taskDoneList = (ArrayList)board.getDoneList().getTasksList();
        taskDoneList.add("Third task done");

        //Then

        assertEquals("First task add to list",taskToDoList.get(0));
        assertEquals("Second task in progress",taskInProgressList.get(0));
        assertEquals("Third task done",taskDoneList.get(0));
    }
}
