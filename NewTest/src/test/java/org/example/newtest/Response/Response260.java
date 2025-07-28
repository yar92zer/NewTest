package org.example.newtest.Response;

public class Response260 {
    public static boolean test260(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 21 && age <= 24
                && salary >= 42000 && salary <= 49000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*
Name: "Николай"
Age: от 21 до 24
Salary: от 42000 руб до 49000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 4 года*/