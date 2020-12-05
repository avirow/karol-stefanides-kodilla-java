package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFilghtRunner {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("MP02", true);
        flightMap.put("MP01", false);

        if (flightMap.get(flight.arrivalAirport) == true) {
            System.out.println("Airport is avaible");
        }
        else {
            throw new RouteNotFoundException();
        }

        }

    public static void main(String[] args) {
        Flight flight = new Flight("MP03", "MP01");
        FindFilghtRunner filghtRunner = new FindFilghtRunner();

        try{
            filghtRunner.findFilght(flight);
        }
        catch (RouteNotFoundException routeNotFoundException){
            System.out.println("Airport is not avaible");
        }
    }

}
