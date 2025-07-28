package org.example.newtest.Response;

public class Response37 {
    public static boolean test37(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 29 && age <= 41
                && zp >= 25000 && zp <= 27000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 29 до 41
Zp: от 25000 руб до 27000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 2 года*/