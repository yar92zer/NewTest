package org.example.newtest.Response;

public class Response24 {
    public static boolean test24(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("З")
                && age >= 19 && age <= 21
                && zp >= 25000 && zp <= 53000
                && country.equalsIgnoreCase("Ш")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Э"
Age: от 19 до 21
Zp: от 25000 руб до 53000 руб
Country: "Ш"
Gender: "Мужской"
Experience: 13 лет*/