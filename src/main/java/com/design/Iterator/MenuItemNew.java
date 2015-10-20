package com.design.Iterator;

/**
 * Created by lei on 15-10-20.
 */
public class MenuItemNew extends MenuComponent {
    private String name;
    private String description;
    private Double price;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("name ....");
        System.out.println(getName());
        System.out.println("description...");
        System.out.println(getDescription());
        System.out.println("price....");
        System.out.println(getPrice());

    }
}
