package org.example.newtest.Response;

public class Response18 {
    public static boolean test18(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Д")
                && age >= 24000 && age <= 27000
                && zp >= 24000 && zp <= 49000
                && country.equalsIgnoreCase("И")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Д"
Age: от 22 до 23
Zp: от 24000 руб до 49000 руб
Country: "И"
Gender: "Мужской"
Experience: 6 лет*/