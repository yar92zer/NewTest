package org.example.newtest.Response;

public class Response367 {
    public static boolean test367(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 36 && age <= 37
                && salary >= 30000 && salary <= 37000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 36 до 37
Salary: от 30000 руб до 37000 руб
Country: "Польша"
Gender: "Женский"
Experience: 15 лет*/