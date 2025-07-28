package org.example.newtest.Response;

public class Response16 {
    public static boolean test16(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ю")
                && age >= 26 && age <= 26
                && zp >= 33000 && zp <= 36000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 26) {
            return true;
        }
        return false;
    }
}
/*Name: "Ю"
Age: от 26 до 26
Zp: от 33000 руб до 36000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 26 лет*/