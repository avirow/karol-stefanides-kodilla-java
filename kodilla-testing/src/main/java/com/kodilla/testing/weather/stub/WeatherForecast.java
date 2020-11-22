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

    public double calculateMedianTemperature( Map<String, Double> sort){
        double median = 0;
        double average = 0;

        if (sort.size() % 2 == 0 ) {
            for (Map.Entry<String, Double> temperature :
                    sort.entrySet()) {
                int i = 1;
                if(i == (sort.size()/2)|| i == ((sort.size()/2)-1)){
                    average += temperature.getValue();
                }
                i++;
            }
            median = average/2;
        }
        else {
            for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {
                int i = 1;
                if(i == (sort.size()/2)){
                    median = temperature.getValue()/2;
                }
                i++;
            }
        }
        return median;
    }

    public HashMap<String, Double> sortByValue(Temperatures hm) {
        List<Map.Entry<String, Double> > list = new LinkedList<>(hm.getTemperatures().entrySet());

        list.sort(Map.Entry.comparingByValue());

        HashMap<String, Double> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
