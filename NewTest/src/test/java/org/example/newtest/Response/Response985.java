package org.example.newtest.Response;

public class Response985 {
    public static boolean test985(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 22 && age <= 58
                && salary >= 20000 && salary <= 23000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Сергей"
Age: от 22 до 58
Salary: от 20000 руб до 23000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/