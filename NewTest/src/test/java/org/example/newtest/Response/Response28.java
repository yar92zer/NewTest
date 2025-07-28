package org.example.newtest.Response;

public class Response28 {
    public static boolean test28(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Щ")
                && age >= 34 && age <= 47
                && zp >= 24000 && zp <= 28000
                && country.equalsIgnoreCase("З")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 19) {
            return true;
        }
        return false;
    }
}
/*Name: "Щ"
Age: от 34 до 47
Zp: от 24000 руб до 28000 руб
Country: "З"
Gender: "Мужской"
Experience: 19 лет*/