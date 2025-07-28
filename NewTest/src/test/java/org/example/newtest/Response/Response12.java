package org.example.newtest.Response;

public class Response12 {
    public static boolean test12(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Я")
                && age >= 21 && age <= 28
                && zp >= 38000 && zp <= 52000
                && country.equalsIgnoreCase("М")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 20) {
            return true;
        }
        return false;
    }
}
/*Name: "Я"
Age: от 21 до 28
Zp: от 38000 руб до 52000 руб
Country: "М"
Gender: "Мужской"
Experience: 20 лет*/