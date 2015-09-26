package com.design.Dec;

/**
 * Created by lei on 15-9-26.
 */
public class HouseBlend extends Beverage {
    private String description;

    @Override
    public double cost() {
        return .88;
    }

    public HouseBlend() {
        this.description = "HouseBlend Coffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
