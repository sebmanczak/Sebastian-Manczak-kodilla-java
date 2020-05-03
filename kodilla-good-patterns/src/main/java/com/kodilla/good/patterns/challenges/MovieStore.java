package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.joining;

public class MovieStore {
    public static Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Zelazny czlowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Msciciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Blyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        booksTitlesWithTranslations.entrySet().stream()
                .map(Map.Entry::getKey)
                .map(Object::toString)
                .collect(joining(" ! "))
                .forEach(System.out::println);

        //System.out.println(booksTitlesWithTranslations.entrySet());
       // booksTitlesWithTranslations.forEach((key, value) -> System.out.println("The titles of the HashMap are: " + value + " ! "));


        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies();
    }
}

