package org.example.newtest.Response;

public class Response873 {
    public static boolean test873(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 37 && age <= 46
                && salary >= 28000 && salary <= 38000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Егор"
Age: от 37 до 46
Salary: от 28000 руб до 38000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/