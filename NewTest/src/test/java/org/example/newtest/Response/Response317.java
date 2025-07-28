package org.example.newtest.Response;

public class Response317 {
    public static boolean test317(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 37 && age <= 39
                && salary >= 20000 && salary <= 37000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 37 до 39
Salary: от 20000 руб до 37000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 12 лет*/