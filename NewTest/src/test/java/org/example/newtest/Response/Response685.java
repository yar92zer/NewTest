package org.example.newtest.Response;

public class Response685 {
    public static boolean test685(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 26 && age <= 28
                && salary >= 28000 && salary <= 31000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Андрей"
Age: от 26 до 28
Salary: от 28000 руб до 31000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 7 лет*/