package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class Door {
    private String name;

    public void open(){
        System.out.println(name + " door open");
    }

    public void close() {
        System.out.println(name + " door close");
    }

    public Door() {
    }

    public Door(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
