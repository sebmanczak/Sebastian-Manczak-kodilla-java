package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Circle", 5.70, 3.14);
        //When
        shapeCollector.addFigure("Circle");
        //Then
        Assert.equals(circle, shapeCollector.get(0));
    }
}
