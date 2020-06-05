package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i); //tworzymy zmienna number i przypisujemy do niej i-ty element z listy numbers
            if(number %2 == 0){
                System.out.println(number);
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
