package com.design.Proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by lei on 15-10-22.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
