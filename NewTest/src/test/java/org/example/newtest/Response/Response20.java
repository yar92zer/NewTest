package org.example.newtest.Response;

public class Response20 {
    public static boolean test20(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("T")
                && age >= 24000 && age <= 27000
                && zp >= 23000 && zp <= 23000
                && country.equalsIgnoreCase("З")
                && gender.equalsIgnoreCase("Женский")
                && experience == 26) {
            return true;
        }
        return false;
    }
}
/*Name: "Т"
Age: от 19 до 24
Zp: от 23000 руб до 23000 руб
Country: "З"
Gender: "Женский"
Experience: 26 лет*/