package com.design.Dec;

/**
 * Created by lei on 15-9-26.
 */
public class Mocha extends Condiment {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }
}
