package org.example.newtest.Response;

public class Response478 {
    public static boolean test478(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 18 && age <= 26
                && salary >= 36000 && salary <= 48000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 18 до 26
Salary: от 36000 руб до 48000 руб
Country: "Польша"
Gender: "Женский"
Experience: 6 лет*/