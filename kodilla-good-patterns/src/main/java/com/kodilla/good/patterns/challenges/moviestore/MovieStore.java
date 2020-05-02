//package com.kodilla.good.patterns.challenges.moviestore;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class MovieStore {
//    public static Map<String, List<String>> getMovies() {
//
//        List<String> ironManTranslations = new ArrayList<>();
//        ironManTranslations.add("Zelazny czlowiek");
//        ironManTranslations.add("Iron Man");
//
//        List<String> avengersTranslations = new ArrayList<>();
//        avengersTranslations.add("Msciciele");
//        avengersTranslations.add("Avengers");
//
//        List<String> flashTranslations = new ArrayList<>();
//        flashTranslations.add("Blyskawica");
//        flashTranslations.add("Flash");
//
//        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
//        booksTitlesWithTranslations.put("IM", ironManTranslations);
//        booksTitlesWithTranslations.put("AV", avengersTranslations);
//        booksTitlesWithTranslations.put("FL", flashTranslations);
//
////        for (Map.Entry<String, List<String>> entry : booksTitlesWithTranslations.entrySet()) {
////            System.out.println("The titles of the HashMap are: " + entry.getKey() + " " + entry.getValue() + " ! ");
////        }
//        String titlesString = Stream.of(booksTitlesWithTranslations.values())
//                .flatmap(oneLine -> new String(oneLine))
//                .collect(Collectors.joining(" ! ", " ", " "));
//
//        System.out.println(titlesString);
//
////        booksTitlesWithTranslations.values().stream()
////                .forEach(titles -> System.out.println(titles));
//
//
//        return booksTitlesWithTranslations;
//    }
//
//    public static void main(String[] args) {
//        MovieStore movieStore = new MovieStore();
//        movieStore.getMovies();
//    }
//}
//
