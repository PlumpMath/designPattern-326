package com.design.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lei on 15-10-19.
 */
public class PancakeHouseMenu implements Menu{
    private ArrayList menuItems;

    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public PancakeHouseMenu() {
    }

    public PancakeHouseMenu(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList menuItems) {
        this.menuItems = menuItems;
    }
}
