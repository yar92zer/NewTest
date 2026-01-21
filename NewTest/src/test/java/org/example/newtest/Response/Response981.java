package org.example.newtest.Response;

public class Response981 {
    public static boolean test981(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 25 && age >= 27
                && salary >= 25 && salary <= 27
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Сергей"
Age: от 25 до 27
Salary: от 26000 руб до 40000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 1 год*/