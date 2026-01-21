package org.example.newtest.CodeRetreat.OrderSystem;

import java.util.ArrayList;
import java.util.List;

abstract class Store {
    protected String type;
    protected List<Order> orders = new ArrayList<>();

    public Store(String type) {
        this.type = type;
    }

    public abstract void display();
}