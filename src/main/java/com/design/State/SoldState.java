package com.design.State;

/**
 * Created by lei on 15-10-22.
 */
public class SoldState implements State {
    private GumballMachineNew gumballMachineNew;

    public SoldState() {
    }

    public SoldState(GumballMachineNew gumballMachineNew) {
        this.gumballMachineNew = gumballMachineNew;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachineNew.releaseBall();
        if(gumballMachineNew.getCount() > 0) {
            gumballMachineNew.setState(gumballMachineNew.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMachineNew.setState(gumballMachineNew.getSoldOutState());
        }
    }
}
