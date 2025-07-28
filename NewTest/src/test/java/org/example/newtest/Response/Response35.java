package org.example.newtest.Response;

public class Response35 {
    public static boolean test35(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 19 && age <= 52
                && zp >= 22000 && zp <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 19 до 52
Zp: от 22000 руб до 34000 руб
Country: "Германия"
Gender: "Женский"
Experience: 8 лет*/