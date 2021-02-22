package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    private Set<Flight> listOfFlights;

    public FlightSearch(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public List<Flight> searchByCityOfDeparture(String nameOfCityDeparture) {

        //System.out.println("Lista lotów do: " + nameOfCityDeparture + "\n");
        List<Flight> flights = listOfFlights.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture))
                .collect(Collectors.toList());

       // System.out.println(flights); // [ Flight{... .... }, ... ]

        return flights;
    }

    public List<Flight> searchByCityOfArrival(String nameOfCityArrival) {

        //System.out.println("Lista lotów do: " + nameOfCityArrival + "\n");
        List<Flight> flights = listOfFlights.stream()
                .filter(f -> f.getCityArrival().equals(nameOfCityArrival))
                .collect(Collectors.toList());

        //System.out.println(flights); // [ Flight{... .... }, ... ]

        return flights;
    }

    public List<List<Flight>> searchByCityForTransfer(String nameOfCityDeparture, String nameOfCityArrival) {

        System.out.println("Lista lotów posrednich z: " + nameOfCityArrival +" do: " + nameOfCityDeparture + "\n");
        List<Flight> flightsFrom = searchByCityOfDeparture(nameOfCityDeparture);
        List<Flight> flightsTo = searchByCityOfArrival(nameOfCityArrival);

        List<Flight> transitFlights = flightsFrom.stream()
                .filter(p -> flightsTo.contains(new Flight(p.getCityArrival(), nameOfCityArrival)))
                        .collect(Collectors.toList());

        List<List<Flight>> flights = new ArrayList<>();
        for(Flight flight : transitFlights){
            List<Flight> connection = new ArrayList<>();
            connection.add(flight);
            flightsTo.stream()
                    .filter(p -> p.getCityDeparture().equals(flight.getCityArrival()))
                    .findFirst()
                    .ifPresent(f -> connection.add(f));
            flights.add(connection);
        }
        System.out.println(flights);

        return flights;
    }


}
