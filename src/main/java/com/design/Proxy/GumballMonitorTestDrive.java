package com.design.Proxy;

import java.rmi.Naming;

/**
 * Created by lei on 15-10-24.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        try {
            GumballMachineNew gumballMachineNew = (GumballMachineNew) Naming.lookup("rmi://127.0.0.1/gumball");
            GuballMonitor monitor = new GuballMonitor(gumballMachineNew);
            monitor.report();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
