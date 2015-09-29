package com.design.Adapter;

/**
 * Created by lei on 15-9-29.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    @Override
    public void fly() {
        turkey.fly();

    }

    @Override
    public void quack() {
        turkey.gobble();

    }

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
}
