package org.example.newtest.Response;

public class Response39 {
    public static boolean test39(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 37 && age <= 49
                && zp >= 38000 && zp <= 39000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 37 до 49
Zp: от 38000 руб до 39000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 13 лет*/