package org.example.newtest.Response;

public class Response609 {
    public static boolean test609(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 28 && age <= 29
                && salary >= 26000 && salary <= 30000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*
Name: "Светлана"
Age: от 28 до 29
Salary: от 26000 руб до 30000 руб
Country: "Испания"
Gender: "Женский"
Experience: 1 год*/
