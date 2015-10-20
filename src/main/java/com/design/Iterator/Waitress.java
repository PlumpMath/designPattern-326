package com.design.Iterator;

import java.util.Iterator;

/**
 * Created by lei on 15-10-19.
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("......Breakfast.........");
        printMenu(pancakeIterator);
        System.out.println("......Dinner............");
        printMenu(dinnerIterator);
    }

    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getVegetarian());
            System.out.println(item.getPrice());
        }
    }
    public Waitress() {
    }

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }
}
