package com.kodilla.testing.collection;
import  com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Check if class OddNumbers working propely "+
            "if get list with odd and even numbers "
    )

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        List<Integer> listWithoutOddNumbers = new ArrayList<>();
        listWithoutOddNumbers.add(2);
        listWithoutOddNumbers.add(4);
        listWithoutOddNumbers.add(6);
        List<Integer> result = oddNumbersExterminator.exterminate(testList);
        //Then
        Assertions.assertEquals(listWithoutOddNumbers, result);
    }

    @DisplayName("Check if class OddNumbers working propely "+
            "if get empty list "
    )

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> testList2 = new ArrayList<>();
        List<Integer> result = oddNumbersExterminator.exterminate(testList2);
        //Then
        Assertions.assertEquals(testList2, result);
    }

}
