package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin.");
    }
    @After
    public void after() {
        System.out.println("Test case: end.");
    }
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
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(40);
        numbers.add(37);
        numbers.add(26);
        numbers.add(13);
        numbers.add(8);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //THen
        Assert.assertEquals(3, result.size());
    }
}
