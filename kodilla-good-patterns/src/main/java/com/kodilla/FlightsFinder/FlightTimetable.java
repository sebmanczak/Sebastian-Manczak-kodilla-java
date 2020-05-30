package com.kodilla.FlightsFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightTimetable {

    private List<Flight> allFlights = new ArrayList<>();

    public FlightTimetable() {
        allFlights.add(new Flight("Wroclaw", "London", 1001));
        allFlights.add(new Flight("Wroclaw", "Berlin", 1002));
        allFlights.add(new Flight("Wroclaw", "Paris", 1003));
        allFlights.add(new Flight("Wroclaw", "Madrid", 1004));
        allFlights.add(new Flight("Wroclaw", "Gdansk", 1005));
        allFlights.add(new Flight("Wroclaw", "New York", 1006));
        allFlights.add(new Flight("Gdansk", "London", 2001));
        allFlights.add(new Flight("Gdansk", "Wroclaw", 2002));
        allFlights.add(new Flight("Gdansk", "Paris", 2003));
        allFlights.add(new Flight("Gdansk", "Barcelona", 2004));
        allFlights.add(new Flight("London", "Rome", 3001));
        allFlights.add(new Flight("London", "Dubai", 3002));
        allFlights.add(new Flight("London", "Sydney", 3003));
        allFlights.add(new Flight("London", "Los Angeles", 3004));
        allFlights.add(new Flight("Sydney", "Tokyo", 30051));
        allFlights.add(new Flight("London", "Tokyo", 3005));
        allFlights.add(new Flight("London", "Manchester", 3006));
        allFlights.add(new Flight("London", "Liverpool", 3007));
        allFlights.add(new Flight("London", "Cairo", 3008));
    }

public List<Flight> findFlightFrom(String departureAirport) {
        return allFlights.stream()
                .filter(e -> e.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
}
public List<Flight> findFlightTo(String arrivalAirport) {
        return allFlights.stream()
                .filter(e -> e.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
}
public List<Flight> findConnectingFlight (String departureAirport, String transferAirport, String arrivalAirport) {
    return Stream.concat(
                findFlightFrom(departureAirport).stream().filter(e -> e.getArrivalAirport().equals(transferAirport)),
                findFlightTo(arrivalAirport).stream().filter(e -> e.getDepartureAirport().equals(transferAirport)))
            .collect(Collectors.toList());
}

    public static void main (String[] args) {
        FlightTimetable flightTimetable = new FlightTimetable();
        List<Flight> result = flightTimetable.findFlightFrom("Gdansk");
        System.out.println(result);

        List<Flight> result2 = flightTimetable.findFlightTo("London");
        System.out.println(result2);

        // All flights from Wroclaw through London to Tokyo
        List<Flight> result3 = flightTimetable.findConnectingFlight("Wroclaw", "London", "Tokyo");
        System.out.println(result3);
    }
}
// loty z danego miasto i potem na kolekcjach dzialac
// poszukac piersza liste i dzialac na podstawie rezultatu z pierwszej listy
