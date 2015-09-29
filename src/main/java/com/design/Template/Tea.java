package com.design.Template;

/**
 * Created by lei on 15-9-29.
 */
public class Tea extends CoffInBeverage  {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");

    }
}
