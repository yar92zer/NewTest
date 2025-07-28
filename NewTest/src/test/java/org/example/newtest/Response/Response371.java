package org.example.newtest.Response;

public class Response371 {
    public static boolean test371(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дvмитрий")
                && age >= 24 && age <= 25
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 24 до 25
Salary: от 27000 руб до 28000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 2 года*/