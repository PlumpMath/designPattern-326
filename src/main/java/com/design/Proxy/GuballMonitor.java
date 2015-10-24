package com.design.Proxy;

import com.design.State.GumballMachine;

/**
 * Created by lei on 15-10-24.
 */
public class GuballMonitor {
    private GumballMachineNew gumballMachine ;

    public GuballMonitor(GumballMachineNew gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("count = " +gumballMachine.getCount());
    }
}
