package org.example.newtest.Response;

public class Response38 {
    public static boolean test39(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 22 && age <= 27
                && zp >= 28000 && zp <= 30000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 22 до 27
Zp: от 28000 руб до 30000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 2 года*/