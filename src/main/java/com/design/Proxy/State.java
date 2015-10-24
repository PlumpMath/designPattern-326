package com.design.Proxy;

import java.io.Serializable;

/**
 * Created by lei on 15-10-22.
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
