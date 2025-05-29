package com.pluralsight.models;

import com.pluralsight.ui.IPriceable;

import java.util.ArrayList;
import java.util.List;

public class Order<T extends IPriceable> {
    private final List<T> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }
}
