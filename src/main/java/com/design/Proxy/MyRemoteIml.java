package com.design.Proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by lei on 15-10-22.
 */
public class MyRemoteIml extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteIml() throws RemoteException {
    }

    protected MyRemoteIml(int port) throws RemoteException {
        super(port);
    }

    protected MyRemoteIml(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }


    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteIml();
            Naming.rebind("RemoteHello", service);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
