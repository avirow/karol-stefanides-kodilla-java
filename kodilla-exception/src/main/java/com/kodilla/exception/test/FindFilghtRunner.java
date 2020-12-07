package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFilghtRunner {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("MP02", true);
        flightMap.put("MP01", false);
        if(flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())){
            return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }

        }

    public static void main(String[] args) {
        Flight flight = new Flight("MP03", "MP01");
        FindFilghtRunner filghtRunner = new FindFilghtRunner();

        try{
            boolean result = filghtRunner.findFilght(flight);
            System.out.println(result);
        }
        catch (RouteNotFoundException routeNotFoundException){
            System.out.println("Airport is not avaible");
        }
    }

}
