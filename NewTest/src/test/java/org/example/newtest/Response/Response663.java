package org.example.newtest.Response;

public class Response663 {
    public static boolean test663(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 19 && age <= 23
                && salary >= 28000 && salary <= 36000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Анна"
Age: от 19 до 23
Salary: от 28000 руб до 36000 руб
Country: "Италия"
Gender: "Женский"
Experience: 3 года*/