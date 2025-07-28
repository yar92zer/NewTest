package org.example.newtest.Response;

public class Response3 {
    public static boolean test2(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Н")
                && age >= 21000 && age <= 37000
                && zp >= 53000 && zp <= 62000
                && country.equalsIgnoreCase("Ч")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 22) {
            return true;
        }
        return false;
    }
}
/*Name: "Н"
Age: от 21 до 37
Zp: от 53000 руб до 62000 руб
Country: "Ч"
Gender: "Мужской"
Experience: 22 лет*/