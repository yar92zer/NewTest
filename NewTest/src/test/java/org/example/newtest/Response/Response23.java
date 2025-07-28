package org.example.newtest.Response;

public class Response23 {
    public static boolean test23(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("П")
                && age >= 41 && age <= 47
                && zp >= 29000 && zp <= 34000
                && country.equalsIgnoreCase("C")
                && gender.equalsIgnoreCase("Женский")
                && experience == 16) {
            return true;
        }
        return false;
    }
}
/*Name: "П"
Age: от 41 до 47
Zp: от 29000 руб до 34000 руб
Country: "С"
Gender: "Женский"
Experience: 16 лет*/