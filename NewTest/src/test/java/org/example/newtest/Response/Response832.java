package org.example.newtest.Response;

public class Response832 {
    public static boolean test832(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 20 && age <= 23
                && salary >= 40000 && salary <= 58000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Максим"
Age: от 20 до 23
Salary: от 40000 руб до 58000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 5 лет*/