//package com.kodilla.FlightsFinder;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class FlightTimetable {
//    public static void main (String[] args) {
//        Flight flight3002 = new Flight("London", "Dubai", 3002);
//
//        List<Flight> allFlightsFromWroclaw = new ArrayList<>();
//
//        allFlightsFromWroclaw.add(new Flight("Wroclaw", "London", 1001));
//        allFlightsFromWroclaw.add(new Flight("Wroclaw", "Berlin", 1002));
//        allFlightsFromWroclaw.add(new Flight("Wroclaw", "Paris", 1003));
//        allFlightsFromWroclaw.add(new Flight("Wroclaw", "Madrid", 1004));
//        allFlightsFromWroclaw.add(new Flight("Wroclaw", "Gdansk", 1005));
//        allFlightsFromWroclaw.add(new Flight("Wroclaw", "New York", 1006));
//
//        List<Flight> allFlightsFromGdansk = new ArrayList<>();
//
//        allFlightsFromGdansk.add(new Flight("Gdansk", "London", 2001));
//        allFlightsFromGdansk.add(new Flight("Gdansk", "Wroclaw", 2002));
//        allFlightsFromGdansk.add(new Flight("Gdansk", "Paris", 2003));
//        allFlightsFromGdansk.add(new Flight("Gdansk", "Barcelona", 2004));
//        allFlightsFromGdansk.add(flight3002);
//
//        List<Flight> allFlightsFromLondon = new ArrayList<>();
//
//        allFlightsFromLondon.add(new Flight("London", "Rome", 3001));
//        allFlightsFromLondon.add(new Flight("London", "Dubai", 3002));
//        allFlightsFromLondon.add(new Flight("London", "Sydney", 3003));
//        allFlightsFromLondon.add(new Flight("London", "Los Angeles", 3004));
//        allFlightsFromLondon.add(new Flight("London", "Tokyo", 3005));
//        allFlightsFromLondon.add(new Flight("London", "Manchester", 3006));
//        allFlightsFromLondon.add(new Flight("London", "Liverpool", 3007));
//        allFlightsFromLondon.add(new Flight("London", "Cairo", 3008));
//
////        System.out.println("There are: " + allFlightsFromGdansk.size() + " flights from Gdansk.");
////
////        for(int n=0; n < allFlightsFromGdansk.size(); n++) {
////            System.out.println("Element " + n + " of flights from Gdansk is " + allFlightsFromGdansk.get(n));
////        }
////        System.out.println("Flight 3002 details: " + flight3002);
////
////        for(Flight aaa: allFlightsFromGdansk) {
////            System.out.println(aaa);
////        }
////        System.out.println("Flight 3002 details: " + allFlightsFromGdansk.get(0));
//
//         List<Flight> f = allFlightsFromLondon.stream()
//                .map(Flight::getArrivalAirport);
//
//        System.out.println(f);
//    }
//}
