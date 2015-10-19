package com.design.Iterator;

/**
 * Created by lei on 15-10-19.
 */
public class MenuItem {
    private String name;
    private String description;
    private String vegetarian;
    private String price;

    public MenuItem() {
    }

    public MenuItem(String name, String description, String vegetarian, String price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
