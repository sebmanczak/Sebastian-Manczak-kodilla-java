package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator decorator) {   //metoda zwraca void i przyjmuje text, decorator
        String beautifulText = decorator.decorate(text);    // zmienna
        //  wynik dzialania funkcji, przypisalem do zmiennej wynik dzialania funkcji decorate z interfaceu PoemDecorator

        System.out.println(beautifulText);
    }

}

//class App {
//    public static void main(String[] args) {
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("table", "AAA"()) -> ;
//    }
//}