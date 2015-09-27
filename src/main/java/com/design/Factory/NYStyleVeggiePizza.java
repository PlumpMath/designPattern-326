package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class NYStyleVeggiePizza extends Pizza {
    private String name = "nyStyleVeggiePizza";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
