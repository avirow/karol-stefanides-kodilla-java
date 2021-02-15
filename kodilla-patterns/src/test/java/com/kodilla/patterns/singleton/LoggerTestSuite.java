package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testGetLastLog() {
        //Given
        logger.log("Test");
        //When
        String logName = logger.getLastLog();
        //Then
        assertEquals("Test", logName);
    }

}
