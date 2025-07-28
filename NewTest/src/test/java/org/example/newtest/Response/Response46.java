package org.example.newtest.Response;

public class Response46 {
    public static boolean test46(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 18 && age <= 35
                && zp >= 23000 && zp <= 27000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 18 до 35
Zp: от 23000 руб до 27000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 лет*/