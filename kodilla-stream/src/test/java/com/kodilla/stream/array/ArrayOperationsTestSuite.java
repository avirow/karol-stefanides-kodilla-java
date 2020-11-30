package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = new int [20];
        int j = 1;

        for(int i = 0; i < 20; i++)
        {
            numbers[i] = j++;
        }

        //When
        ArrayOperations arrayOperations = new ArrayOperations() {
            @Override
            public OptionalDouble getAverage(int[] numbers) {
                IntStream.range(0, numbers.length)
                        .forEach(System.out::println);
                OptionalDouble result = IntStream.range(0, numbers.length)
                        .average();
                return result;
            }
        };
        OptionalDouble result = arrayOperations.getAverage(numbers);
        double value = result.orElseThrow(IllegalStateException::new);

        //Then
        assertEquals( 9.5, value);
    }
}
