package org.example.newtest.Response;

public class Response652 {
    public static boolean test652(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 20 && age <= 26
                && salary >= 22000 && salary <= 33000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Егор"
Age: от 20 до 26
Salary: от 22000 руб до 33000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/