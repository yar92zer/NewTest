package org.example.newtest.Response;

public class Response25 {
    public static boolean test25(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Н")
                && age >= 18 && age <= 26
                && zp >= 36000 && zp <= 43000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 18) {
            return true;
        }
        return false;
    }
}
/*Name: "Н"
Age: от 18 до 26
Zp: от 36000 руб до 43000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 18 лет*/