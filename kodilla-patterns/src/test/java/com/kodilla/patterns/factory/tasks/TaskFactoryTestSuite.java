package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.generateTask(TaskFactory.DRIVING_TASK);
        boolean expectedIsTaskDoneBeforeExecuteTask = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean expectedIsTaskDone = drivingTask.isTaskExecuted();

        //Then
        assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        assertEquals("Delegation", drivingTask.getTaskName());
        assertTrue(expectedIsTaskDone);

    }

    @Test
    public void testFactoryShoppingFactory() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.generateTask(TaskFactory.SHOPPING_TASK);
        boolean expectedIsTaskDoneBeforeExecuteTask = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean expectedIsTaskDone = shoppingTask.isTaskExecuted();

        //Then
        assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        assertEquals("Ramen", shoppingTask.getTaskName());
        assertTrue(expectedIsTaskDone);
    }

    @Test
    public void testFactoryPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.generateTask(TaskFactory.PAINTING_TASK);
        boolean expectedIsTaskDoneBeforeExecuteTask = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean expectedIsTaskDone = paintingTask.isTaskExecuted();

        //Then
        assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        assertEquals("Bob Ross", paintingTask.getTaskName());
        assertTrue(expectedIsTaskDone);
    }
}
