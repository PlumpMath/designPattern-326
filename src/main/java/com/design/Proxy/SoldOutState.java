package com.design.Proxy;

/**
 * Created by lei on 15-10-22.
 */
public class SoldOutState implements State {
    transient  private GumballMachineNew gumballMachineNew;

    public SoldOutState() {
    }

    public SoldOutState(GumballMachineNew gumballMachineNew) {
        this.gumballMachineNew = gumballMachineNew;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not eject, you have not inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
