package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    private String name="ChicagoStyleCheesePizza";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
