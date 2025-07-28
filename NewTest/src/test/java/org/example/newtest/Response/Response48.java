package org.example.newtest.Response;

public class Response48 {
    public static boolean test48(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 23 && age <= 35
                && zp >= 21000 && zp <= 30000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 23 до 35
Zp: от 21000 руб до 30000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 10 лет*/