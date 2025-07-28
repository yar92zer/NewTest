package org.example.newtest.Response;

public class Response475 {
    public static boolean test475(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 53 && age <= 54
                && salary >= 22000 && salary <= 30000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 53 до 54
Salary: от 22000 руб до 30000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/