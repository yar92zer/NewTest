package org.example.newtest.Response;

public class Response49 {
    public static boolean test49(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 24 && age <= 58
                && zp >= 28000 && zp <= 43000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 24 до 58
Zp: от 28000 руб до 43000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год*/