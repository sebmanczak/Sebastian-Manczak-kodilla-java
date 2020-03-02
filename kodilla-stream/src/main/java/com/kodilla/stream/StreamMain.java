package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Let's make the text nicer.");
        poemBeautifier.beautify("Example text", table -> "* " + table + " *" );
        poemBeautifier.beautify("flower", xxx -> "ABC  " + xxx + "  DEF");
        poemBeautifier.beautify("fjdifjidj", tutut -> tutut.toUpperCase());
        poemBeautifier.beautify("RRRRRRRRRR", yy -> yy.toLowerCase());
        poemBeautifier.beautify("RRRRRRRRRR", yy -> yy.replaceAll("R", "A"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Processor processor = new Processor();
        //processor.execute(() -> System.out.println("This is an example text."));

        //Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("This is an example text.");
        //processor.execute(codeToExecute);

        //        Processor processor = new Processor();
        //        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //        processor.execute(executeSaySomething);

        //        System.out.println("Welcome to module 7 - Stream");
        //        SaySomething saySomething = new SaySomething();
        //        saySomething.say();
    }
}
