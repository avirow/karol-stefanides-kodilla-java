package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public String getFigure(int n){
        if(0 == shapeList.size()){
            return "error";
        }
        Shape result = shapeList.get(n);
        String shapeName = result.getShapeName();
        return shapeName;
    }

    public String showFigures(){
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        String result = (square.toString()+circle.toString()+triangle.toString());
        return result;
    }

    public int getListSize() {
        return shapeList.size();
    }
}
