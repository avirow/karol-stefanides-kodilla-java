package com.kodilla.testing.shape;

public class Circle implements Shape {
    String shapeName = "Circle";
    int field = 50;

    public String getShapeName(){
        return this.shapeName;
    }

    public int getField(){
        return this.field;
    }
}
