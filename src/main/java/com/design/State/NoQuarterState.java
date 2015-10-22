package com.design.State;

/**
 * Created by lei on 15-10-22.
 */
public class NoQuarterState implements State {
    private GumballMachineNew gumballMachineNew;

    public NoQuarterState() {
    }

    public NoQuarterState(GumballMachineNew gumballMachineNew) {
        this.gumballMachineNew = gumballMachineNew;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachineNew.setState(gumballMachineNew.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
