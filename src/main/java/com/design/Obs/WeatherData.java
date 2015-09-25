package com.design.Obs;

import java.util.ArrayList;

/**
 * Created by lei on 15-9-25.
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observerArrayList = new ArrayList<Observer>();
    private double temperature;
    private double humidity;


    public void setMessage(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        messageChanged();
    }

    public void messageChanged(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);

    }

    @Override
    public void deleteObserver(Observer observer) {
        observerArrayList.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer :observerArrayList){
            observer.update(temperature, humidity);
        }
    }


    public WeatherData() {
    }



    public ArrayList<Observer> getObserverArrayList() {
        return observerArrayList;
    }

    public void setObserverArrayList(ArrayList<Observer> observerArrayList) {
        this.observerArrayList = observerArrayList;
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
