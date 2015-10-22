package com.design.State;

/**
 * Created by lei on 15-10-22.
 */
public class WinnerState implements State {
    private GumballMachineNew gumballMachineNew;

    public WinnerState() {
    }

    public WinnerState(GumballMachineNew gumballMachineNew) {
        this.gumballMachineNew = gumballMachineNew;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        System.out.println("You are a WINNER! you get two gumballs for your quarter");
        gumballMachineNew.releaseBall();
        if(gumballMachineNew.getCount() ==0) {
            gumballMachineNew.setState(gumballMachineNew.getSoldOutState());
        } else {
            gumballMachineNew.releaseBall();
            if(gumballMachineNew.getCount() >0) {
                gumballMachineNew.setState(gumballMachineNew.getNoQuarterState());
            } else {
                System.out.println("Oops, out of grumballs!");
                gumballMachineNew.setState(gumballMachineNew.getSoldOutState());
            }
        }
    }
}
