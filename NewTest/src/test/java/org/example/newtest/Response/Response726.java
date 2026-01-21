package org.example.newtest.Response;

public class Response726 {
    public static boolean test726(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 27 && age <= 30
                && salary >= 36000 && salary <= 37000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Егор"
Age: от 27 до 30
Salary: от 36000 руб до 37000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 2 года*/