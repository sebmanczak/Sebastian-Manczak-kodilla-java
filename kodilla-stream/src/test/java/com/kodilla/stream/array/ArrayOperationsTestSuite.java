package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[]{1,2,3, 44, 20};
        //When
        double Avg = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(14.0, Avg, 0.01);
    }
}
