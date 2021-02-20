package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isDone = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask(){
        if (isDone == false) {
            System.out.println("Executing task " + taskName);
            isDone = true;
        }
    }

    @Override
    public boolean isTaskExecuted(){
        return isDone;
    }
}
