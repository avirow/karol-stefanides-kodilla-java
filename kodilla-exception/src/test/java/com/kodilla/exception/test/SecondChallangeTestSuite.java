package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallangeTestSuite {

    @Test
    void testSecondChallengeOneWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(2, 1.5));
    }

    @Test
    void testSecondChallengeTwoWrong() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // when & then
        assertThrows(Exception.class, () -> exceptionHandling.handling(2, 3.5));
    }

}
