package com.kodilla.good.patterns.challenges.flight;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    private Set<Flight> listOfFlights;

    public FlightSearch(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public void searchByCityOfDeparture(String nameOfCityDeparture) {

        System.out.println("Lista lotów do: " + nameOfCityDeparture + "\n");
        listOfFlights.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityOfArrival(String nameOfCityArrival) {

        System.out.println("Lista lotów do: " + nameOfCityArrival + "\n");
        listOfFlights.stream()
                .filter(f -> f.getCityArrival().equals(nameOfCityArrival))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityForTransfer(String nameOfCityDeparture, String nameOfCityInterchange, String nameOfCityArrival) {

        System.out.println("Lista lotów z: " + nameOfCityDeparture
                + " do: " + nameOfCityArrival + " z przesiadka w: " + nameOfCityInterchange + "\n");
        List<Flight> listOfFlightsWithInterChange = listOfFlights.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture) && f.getCityArrival().equals(nameOfCityInterchange))
                .collect(Collectors.toList());
        listOfFlights.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityInterchange) && f.getCityArrival().equals(nameOfCityArrival))
                .collect(Collectors.toCollection(() -> listOfFlightsWithInterChange));
        listOfFlightsWithInterChange.stream()
                .forEach(System.out::println);
    }
}
