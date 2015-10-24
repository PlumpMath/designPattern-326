package com.design.Proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by lei on 15-10-24.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    public void go() {
        MyRemote service = null;
        try {
            service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        String s = null;
        try {
            s = service.sayHello();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
