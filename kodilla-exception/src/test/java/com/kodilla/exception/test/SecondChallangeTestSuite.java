package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallangeTestSuite {

    @Test
    void testSecondChallengeXTwoWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(2, 1.5));
    }

    @Test
    void testSecondChallengeAllWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertDoesNotThrow(() -> exceptionHandling.handling(1.5, 3.5));
    }

    @Test
    void testSecondChallengeXWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(3, 3.5));
    }

    @Test
    void testSecondChallengeAllGood() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(3, 1.5));
    }

    @Test
    void testSecondChallengeXOneWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(1, 1.5));
    }

    @Test
    void testSecondChallengeXZeroWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(0, 1.5));
    }

    @Test
    void testSecondChallengeCloseYWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(2, 1.5000001));
    }

}
