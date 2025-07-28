package org.example.newtest.Response;

public class Response150 {
    public static boolean test150(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 21 && age <= 38
                && salary >= 21000 && salary <= 47000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 21 до 38
Salary: от 21000 руб до 47000 руб
Country: "Италия"
Gender: "Женский"
Experience: 15 лет*/