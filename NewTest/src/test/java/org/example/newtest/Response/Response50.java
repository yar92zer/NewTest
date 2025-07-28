package org.example.newtest.Response;

public class Response50 {
    public static boolean test46(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 44 && age <= 46
                && zp >= 23000 && zp <= 50000
                && country.equalsIgnoreCase("Польща")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 44 до 46
Zp: от 23000 руб до 50000 руб
Country: "Польша"
Gender: "Женский"
Experience: 5 лет*/