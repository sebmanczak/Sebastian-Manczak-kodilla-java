package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Circle");
        //When
        ShapeCollector.addFigure("circle");
        //Then
        Assert.assertEquals(1, shapeCollector);
    }
}
