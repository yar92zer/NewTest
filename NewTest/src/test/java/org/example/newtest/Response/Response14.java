package org.example.newtest.Response;

public class Response14 {
    public static boolean test14(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Щ")
                && age >= 41 && age <= 54
                && zp >= 22000 && zp <= 31000
                && country.equalsIgnoreCase("Л")
                && gender.equalsIgnoreCase("Женский")
                && experience == 17) {
            return true;
        }
        return false;
    }
}
/*Name: "Щ"
Age: от 41 до 54
Zp: от 22000 руб до 31000 руб
Country: "Л"
Gender: "Женский"
Experience: 17 лет*/