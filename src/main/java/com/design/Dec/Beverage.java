package com.design.Dec;

/**
 * Created by lei on 15-9-26.
 */
public abstract class Beverage {
    private String description = "UnKnown Bervage";

    public abstract double cost();
    public Beverage() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
