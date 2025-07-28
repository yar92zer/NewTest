package org.example.newtest.Response;

public class Response90 {
    public static boolean test90(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 53 && age <= 56
                && salary >= 38000 && salary <= 47000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 53 до 56
Salary: от 38000 руб до 47000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 3 года*/