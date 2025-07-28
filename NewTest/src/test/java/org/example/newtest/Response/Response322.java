package org.example.newtest.Response;

public class Response322 {
    public static boolean test322(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 27 && age <= 29
                && salary >= 46000 && salary <= 48000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 27 до 29
Salary: от 46000 руб до 48000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 7 лет*/