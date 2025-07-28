package org.example.newtest.Response;

public class Response44 {
    public static boolean test44(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 22 && age <= 25
                && zp >= 24000 && zp <= 32000
                && country.equalsIgnoreCase("Польща")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 22 до 25
Zp: от 24000 руб до 32000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 2 года*/