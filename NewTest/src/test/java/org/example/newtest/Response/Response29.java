package org.example.newtest.Response;

public class Response29 {
    public static boolean test29(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("В")
                && age >= 24 && age <= 27
                && zp >= 41000 && zp <= 42000
                && country.equalsIgnoreCase("H")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 34) {
            return true;
        }
        return false;
    }
}
/*Name: "В"
Age: от 24 до 27
Zp: от 41000 руб до 42000 руб
Country: "Н"
Gender: "Мужской"
Experience: 34 лет*/