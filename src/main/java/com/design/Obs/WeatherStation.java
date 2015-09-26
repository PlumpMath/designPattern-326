package com.design.Obs;

/**
 * Created by lei on 15-9-25.
 */
public class WeatherStation {
    public static void main(String[] args) {
  /*      CurrentConditionDisplay terminal1 = new CurrentConditionDisplay();
        CurrentConditionDisplay terminal2 = new CurrentConditionDisplay();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(terminal1);
        weatherData.registerObserver(terminal2);
        weatherData.setMessage(4.0, 5.0);
        weatherData.setMessage(7.0, 10.0);*/
        NewWeatherStation weatherStation = new NewWeatherStation();
        NewClient client1 = new NewClient(weatherStation);
        NewClient client12 = new NewClient(weatherStation);
        weatherStation.setMeasurements(4.0, 5.0);
        weatherStation.setMeasurements(5.0, 6.0);
    }
}
