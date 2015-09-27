package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    private String name="ChicagoStyleVeggiePizza";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
