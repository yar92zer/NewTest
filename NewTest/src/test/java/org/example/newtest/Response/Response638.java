package org.example.newtest.Response;

public class Response638 {
    public static boolean test638(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 28 && age <= 40
                && salary >= 64000 && salary <= 68000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 28 до 40
Salary: от 64000 руб до 68000 руб
Country: "Германия"
Gender: "Женский"
Experience: 8 лет*/