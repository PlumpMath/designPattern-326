package com.design.Dec;

/**
 * Created by lei on 15-9-26.
 */
public class Espresso extends Beverage {
    private String description;
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.00;
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
