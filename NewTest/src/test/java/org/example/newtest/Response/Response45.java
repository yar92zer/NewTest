package org.example.newtest.Response;

public class Response45 {
    public static boolean test45(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 18 && age <= 21
                && zp >= 33000 && zp <= 36000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 18 до 21
Zp: от 33000 руб до 36000 руб
Country: "Германия"
Gender: "Женский"
Experience: 3 года*/