package org.example.newtest.Response;

public class Response582 {
    public static boolean test582(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизавета")
                && age >= 22 && age <= 34
                && salary >= 53000 && salary <= 64000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 22 до 34
Salary: от 53000 руб до 64000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 6 лет*/