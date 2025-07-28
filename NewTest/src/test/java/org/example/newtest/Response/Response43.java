package org.example.newtest.Response;

public class Response43 {
    public static boolean test43(String name, int age, int zp, String country, String gender, int experinence) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 28 && age <= 36
                && zp >= 20000 && zp <= 29000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женская")
                && experinence == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 28 до 36
Zp: от 20000 руб до 29000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 2 года*/