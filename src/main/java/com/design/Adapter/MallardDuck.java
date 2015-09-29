package com.design.Adapter;

/**
 * Created by lei on 15-9-29.
 */
public class MallardDuck implements Duck {
    private String name;
    @Override
    public void fly() {
        System.out.println("flying ...");
    }

    @Override
    public void quack() {
        System.out.println("quack, quack, quack...");

    }

    public MallardDuck() {
    }

    public MallardDuck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
