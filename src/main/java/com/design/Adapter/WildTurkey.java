package com.design.Adapter;

/**
 * Created by lei on 15-9-29.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble...");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance...");

    }
}
