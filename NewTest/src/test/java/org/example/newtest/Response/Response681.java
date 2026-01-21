package org.example.newtest.Response;

public class Response681 {
    public static boolean test681(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 29 && age <= 30
                && salary >= 31000 && salary <= 42000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Егор"
Age: от 29 до 30
Salary: от 31000 руб до 42000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 5 лет*/