package com.design.Obs;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * Created by lei on 15-9-25.
 */
public class NewClient implements java.util.Observer,DisplayElement {
    private Observable observable;
    private double temperature;
    private double humidity;

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof NewWeatherStation){
            NewWeatherStation newWeatherStation = (NewWeatherStation) o;
            this.temperature = newWeatherStation.getTemperature();
            this.humidity = newWeatherStation.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
    }

    public NewClient() {
    }

    public NewClient(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
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
