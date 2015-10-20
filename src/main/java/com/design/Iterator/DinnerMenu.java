package com.design.Iterator;

import java.util.Iterator;

/**
 * Created by lei on 15-10-19.
 */
public class DinnerMenu implements Menu {
    private static final int MAX_ITEMS =  6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;


    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }


    public DinnerMenu() {
    }

    public DinnerMenu(int numberOfItems, MenuItem[] menuItems) {
        this.numberOfItems = numberOfItems;
        this.menuItems = menuItems;
    }

    public static int getMaxItems() {
        return MAX_ITEMS;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
}
