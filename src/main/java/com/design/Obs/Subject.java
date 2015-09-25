package com.design.Obs;

/**
 * Created by lei on 15-9-25.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver();
}
