package org.example.newtest.Response;

public class Response218 {
    public static boolean test218(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 39 && age <= 40
                && salary >= 21000 && salary <= 31000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*
Name: "Светлана"
Age: от 39 до 40
Salary: от 21000 руб до 31000 руб
Country: "Германия"
Gender: "Женский"
Experience: 7 лет*/