package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculationsAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 20.0;
        double b = 30.0;
        //When
        double sum = calculator.add(a, b);
        //Then
        Assert.assertEquals(50, sum, 0.01);
    }
    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 542.28;
        double b = 854.22;
        //When
        double sub = calculator.sub(a, b);
        //Then
        Assert.assertEquals(-311.94, sub, 0.01);
    }
    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 45.45;
        double b = 2.11;
        //When
        double mul = calculator.mul(a, b);
        //Then
        Assert.assertEquals(95.89, mul, 0.01);
    }
    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 9.99;
        double b = 3.33;
        //When
        double div = calculator.div(a, b);
        //Then
        Assert.assertEquals(3, div, 0.01);
    }
}
