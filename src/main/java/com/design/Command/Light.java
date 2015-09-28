package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class Light {
    private String name;

    public void on(){
        System.out.println(name + " light on");
    }

    public void off() {
        System.out.println(name + " light off");
    }
    public Light() {
    }


    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
