package com.design.Template;

/**
 * Created by lei on 15-9-29.
 */
public class Coffee extends CoffInBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");

    }
}
