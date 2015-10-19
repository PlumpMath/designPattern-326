package com.design.Iterator;

import java.util.Iterator;

/**
 * Created by lei on 15-10-19.
 */
public class DinnerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    @Override
    public boolean hasNext() {
        return items.length > position && (items[position] != null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public DinnerMenuIterator() {
    }

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem[] getItems() {
        return items;
    }

    public void setItems(MenuItem[] items) {
        this.items = items;
    }
}
