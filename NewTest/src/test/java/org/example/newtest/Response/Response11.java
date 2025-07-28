package org.example.newtest.Response;

public class Response11 {
    public static boolean test11(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("У")
                && age >= 21 && age<= 23
                && zp >= 39000 && zp <= 41000
                && country.equalsIgnoreCase("Д")
                && gender.equalsIgnoreCase("Женский")
                && experience == 23) {
            return true;
        }
        return false;
    }
}
/*Name: "У"
Age: от 21 до 23
Zp: от 39000 руб до 41000 руб
Country: "Д"
Gender: "Женский"
Experience: 23 лет*/