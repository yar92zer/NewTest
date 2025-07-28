package org.example.newtest.Response;

public class Response500 {
    public static boolean test500(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 19 && age <= 35
                && salary >= 37000 && salary <= 47000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 19 до 35
Salary: от 37000 руб до 47000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 7 лет*/