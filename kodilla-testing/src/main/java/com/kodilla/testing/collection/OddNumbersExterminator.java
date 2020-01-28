package com.kodilla.testing.collection;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers) {
        for (int i = 1; i<=100; i++){
            if(i %2!= 0){
                System.out.println(i)
            }
        }
    }
}
