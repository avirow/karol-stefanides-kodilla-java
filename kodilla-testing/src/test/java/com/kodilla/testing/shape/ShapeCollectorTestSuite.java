package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddCircleShape(){
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(1, shapeCollector.getListSize());
    }

    @Test
    public void testRemoveCircleShape(){
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assertions.assertEquals(0, shapeCollector.getListSize());
    }

    @Test
    public void testAddSquareShape(){
        //Given
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector(square);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assertions.assertEquals(1, shapeCollector.getListSize());
    }

    @Test
    public void testRemoveSquareShape(){
        //Given
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assertions.assertEquals(0, shapeCollector.getListSize());
    }

    @Test
    public void testAddTriangleShape(){
        //Given
        Triangle triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assertions.assertEquals(1, shapeCollector.getListSize());
    }

    @Test
    public void testRemoveTriangleShape(){
        //Given
        Triangle triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.removeFigure(triangle);
        //Then
        Assertions.assertEquals(0, shapeCollector.getListSize());
    }

    @Test
    public void testGetFigure(){
        //Given
        Circle circle = new Circle();
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        String obtained = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(circle.getShapeName(), obtained);
    }

    @Test
    public void testGetFigureEmptyList(){
        //Given
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector(square);
        //When
        String obtained = shapeCollector.getFigure(1);
        //Then
        Assertions.assertEquals(null, obtained);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        String result = shapeCollector.showFigures();
        //Then
        Assertions.assertEquals("Square Circle Triangle", result);
    }
}
