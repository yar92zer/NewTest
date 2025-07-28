package org.example.newtest.Response;

public class Response47 {
    public static boolean test47(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 24 && age <= 58
                && zp >= 37000 && zp <= 53000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 24 до 58
Zp: от 37000 руб до 53000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 7 лет*/