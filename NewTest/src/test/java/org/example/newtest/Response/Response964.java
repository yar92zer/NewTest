package org.example.newtest.Response;

public class Response964 {
    public static boolean test964(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 30 && age <= 34
                && salary >= 20000 && salary <= 34000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Максим"
Age: от 30 до 34
Salary: от 20000 руб до 34000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 11 лет*/