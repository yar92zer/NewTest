package org.example.newtest.Response;

public class Response978 {
    public static boolean test978(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 52 && age <= 54
                && salary >= 31000 && salary <= 32000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Дмитрий"
Age: от 52 до 54
Salary: от 31000 руб до 32000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 1 год*/