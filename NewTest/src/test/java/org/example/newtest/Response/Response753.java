package org.example.newtest.Response;

public class Response753 {
    public static boolean test753(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 37 && age <= 39
                && salary >= 28000 && salary <= 53000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Виктория"
Age: от 37 до 39
Salary: от 28000 руб до 53000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 2 года*/