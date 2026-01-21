package org.example.newtest.CodeRetreat.University;

import java.util.ArrayList;
import java.util.List;

abstract class Group {
    protected String title;
    protected List<Person> members = new ArrayList<>();

    public Group(String title) {
        this.title = title;
    }

    public abstract void showInfo();
}