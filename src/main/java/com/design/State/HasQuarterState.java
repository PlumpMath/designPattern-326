package com.design.State;

/**
 * Created by lei on 15-10-22.
 */
public class HasQuarterState implements State {
    private GumballMachineNew gumballMachineNew;

    public HasQuarterState(GumballMachineNew gumballMachineNew) {
        this.gumballMachineNew = gumballMachineNew;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can not insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachineNew.setState(gumballMachineNew.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ...");
        gumballMachineNew.setState(gumballMachineNew.getNoQuarterState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");

    }

    public GumballMachineNew getGumballMachineNew() {
        return gumballMachineNew;
    }

    public void setGumballMachineNew(GumballMachineNew gumballMachineNew) {
        this.gumballMachineNew = gumballMachineNew;
    }
}
