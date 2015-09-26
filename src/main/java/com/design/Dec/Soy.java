package com.design.Dec;

/**
 * Created by lei on 15-9-26.
 */
public class Soy extends Condiment {
    private Beverage beverage;

    public Soy() {
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 3.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Soy";
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
