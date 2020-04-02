package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String pairOfNumbers = secondChallenge.probablyIWillThrowException(2.5, 1.55);
            System.out.println(pairOfNumbers);
        } catch(Exception e) {
            System.out.println("Wrong numbers");
        } finally {
            System.out.println("Someone entered a pair of numbers.");
        }
    }
}
