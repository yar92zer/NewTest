package org.example.newtest.Response;

public class Response155 {
    public static boolean test155(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 18 && age <= 19
                && salary >= 37000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 18 до 19
Salary: от 37000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год*/