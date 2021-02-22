package com.kodilla.good.patterns.challenges.flight;

public class Application {
    public static void main(String[] args) {

        FlightRegister flightRegister = Process.process();

        FlightSearch flightSearchEngine = new FlightSearch(flightRegister.getListOfFlights());
        flightSearchEngine.searchByCityOfDeparture("Warszawa");
        flightSearchEngine.searchByCityOfArrival("Gdansk");
        flightSearchEngine.searchByCityForTransfer("Katowice", "Gdansk");
    }
}
