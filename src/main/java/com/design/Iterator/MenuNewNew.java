package com.design.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lei on 15-10-22.
 */
public class MenuNewNew extends MenuComponent {

    private ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.println("name ...");
        System.out.println(getName());
        System.out.println("description....");
        System.out.println(getDescription());

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }




}
