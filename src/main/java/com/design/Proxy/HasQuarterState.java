package com.design.Proxy;

import java.util.Random;

/**
 * Created by lei on 15-10-22.
 */
public class HasQuarterState implements State {
    transient  private GumballMachineNew gumballMachineNew;
    Random randomWinner = new Random(System.currentTimeMillis());

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
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachineNew.getCount() >1)){
            gumballMachineNew.setState(gumballMachineNew.getWinnerState());
        }else {
            gumballMachineNew.setState(gumballMachineNew.getSoldState());
        }
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
