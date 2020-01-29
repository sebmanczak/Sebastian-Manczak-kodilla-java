package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When

        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(0, result.size());
    }
}
