package org.example.newtest.Response;

public class Response10 {
    public static boolean test10(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Х")
                && age >= 42 && age <= 42
                && zp >= 39000 && zp <= 40000
                && country.equalsIgnoreCase("O")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Х"
Age: от 42 до 42
Zp: от 39000 руб до 40000 руб
Country: "О"
Gender: "Мужской"
Experience: 7 лет*/