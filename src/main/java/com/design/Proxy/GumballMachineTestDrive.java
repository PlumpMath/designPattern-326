package com.design.Proxy;

import com.design.State.GumballMachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by lei on 15-10-24.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineNew gumballMachine = new GumballMachineNew(100);
        try {
            Naming.rebind("gumball", gumballMachine);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
