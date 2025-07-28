package org.example.newtest.Response;

public class Response540 {
    public static boolean test540(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 18 && age <= 34
                && salary >= 20000 && salary <= 28000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 18 до 34
Salary: от 20000 руб до 28000 руб
Country: "Франция"
Gender: "Женский"
Experience: 9 лет*/