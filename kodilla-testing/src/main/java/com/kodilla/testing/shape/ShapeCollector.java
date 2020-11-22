package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();
    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){

    }

    public void removeFigure(Shape shape){

    }

    public void getFigure(int n){

    }

    public void showFigures(){

    }

    public int getListSize() {
        return shapeList.size();
    }
}
