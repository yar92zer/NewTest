package org.example.newtest.CodeRetreat.BankSystem;

import java.util.ArrayList;
import java.util.List;

abstract class Department {
    protected String name;
    protected List<Account> accounts = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public abstract void report();
}