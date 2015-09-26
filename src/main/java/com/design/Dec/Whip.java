package com.design.Dec;

/**
 * Created by lei on 15-9-26.
 */
public class Whip extends Condiment  {
    private Beverage beverage;

    public Whip() {
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Whip";
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
