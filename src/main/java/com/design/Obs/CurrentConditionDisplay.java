package com.design.Obs;

/**
 * Created by lei on 15-9-25.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;

    @Override
    public void display() {
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
    }

    @Override
    public void update(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
