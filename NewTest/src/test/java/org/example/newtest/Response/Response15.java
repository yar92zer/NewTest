package org.example.newtest.Response;

public class Response15 {
    public static boolean test15(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Д")
                && age >= 21 && age <= 58
                && zp >= 51000 && zp <= 56000
                && country.equalsIgnoreCase("Х")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Д"
Age: от 21 до 58
Zp: от 51000 руб до 56000 руб
Country: "Х"
Gender: "Женский"
Experience: 13 лет*/