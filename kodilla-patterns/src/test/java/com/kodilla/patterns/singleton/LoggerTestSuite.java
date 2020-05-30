package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLasLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("abc");
        logger.log("xyz");
        logger.log("def");
        //Then
        Assert.assertEquals("def", logger.getLastLog());
    }
}
