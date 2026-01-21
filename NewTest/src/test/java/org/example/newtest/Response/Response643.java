package org.example.newtest.Response;

public class Response643 {
    public static boolean test643(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 28 && age <= 51
                && salary >= 38000 && salary <= 48000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 28 до 51
Salary: от 38000 руб до 48000 руб
Country: "Польша"
Gender: "Женский"
Experience: 2 года*/