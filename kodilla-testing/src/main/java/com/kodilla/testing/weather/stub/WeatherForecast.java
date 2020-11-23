package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature(){
        double average = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }
        double result = average / temperatures.getTemperatures().size();
        return result;
    }

    public double calculateMedianTemperature(){
        double median = 0;
        double average = 0;
        List<Double> temps = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temps);

        if (temps.size() % 2 == 0 ) {
            int centerLeft = temps.size()/2 - 1;
            int centerRight = temps.size()/2 ;
            median = (temps.get(centerLeft)+temps.get(centerRight))/2.0;
        }
        else {
            int center = temps.size() / 2;
            median = temps.get(center);
        }
        return median;
    }

}
