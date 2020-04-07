package com.kodilla.exception.test;
import java.util.HashMap;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", false);
        airports.put("Wroclaw", false);
        airports.put("Dublin", false);

        Boolean departureAirport = airports.get(flight.getDepartureAirport());
        Boolean arrivalAirport = airports.get(flight.getArrivalAirport());

        if (departureAirport == null || arrivalAirport == null) {
            throw new RouteNotFoundException();
        }
        return arrivalAirport;
    }
    public static void main(String[] args) {
        Flight flight = new Flight("Dublin", "London");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight.");
        }
    }
}