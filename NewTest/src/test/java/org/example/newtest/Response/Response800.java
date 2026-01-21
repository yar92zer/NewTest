package org.example.newtest.Response;

public class Response800 {
    public static boolean test800(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 18 && age <= 47
                && salary >= 27000 && salary <= 42000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Максим"
Age: от 18 до 47
Salary: от 27000 руб до 42000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 8 лет*/