package com.design.Obs;

import java.util.Observable;

/**
 * Created by lei on 15-9-25.
 */
public class NewWeatherStation extends Observable {
    private double temperature;
    private double humidity;

    public void measurementsChanged() {
        setChanged();
        notifyObservers(this);
    }

    public void setMeasurements(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public NewWeatherStation() {
    }

    public NewWeatherStation(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
