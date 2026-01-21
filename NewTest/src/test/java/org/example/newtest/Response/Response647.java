package org.example.newtest.Response;

public class Response647 {
    public static boolean test647(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизавета")
                && age >= 27 && age <= 29
                && salary >= 21000 && salary <= 29000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 27 до 29
Salary: от 21000 руб до 29000 руб
Country: "Польша"
Gender: "Женский"
Experience: 10 лет*/