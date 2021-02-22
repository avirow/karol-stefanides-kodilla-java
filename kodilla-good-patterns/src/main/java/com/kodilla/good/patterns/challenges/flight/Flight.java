package com.kodilla.good.patterns.challenges.flight;

import java.util.Objects;

public class Flight {
    private String cityDeparture;
    private String cityArrival;
    private int numberOfFlight;

    public Flight(String cityDeparture, String cityArrival, int numberOfFlight) {
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.numberOfFlight = numberOfFlight;
    }

    public Flight(String cityDeparture, String cityArrival) {
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(cityDeparture, flight.cityDeparture) &&
                Objects.equals(cityArrival, flight.cityArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityDeparture, cityArrival);
    }

    @Override
    public String toString() {
        return "Nr lotu: " + numberOfFlight + " wylot: " + cityDeparture + " przylot: " + cityArrival;
    }
}
