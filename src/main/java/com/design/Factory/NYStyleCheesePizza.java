package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class NYStyleCheesePizza extends Pizza {
    private String name = "nyStyleCheesePizza";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
