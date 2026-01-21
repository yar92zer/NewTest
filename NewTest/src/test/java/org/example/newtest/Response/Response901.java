package org.example.newtest.Response;

public class Response901 {
    public static boolean test901(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 41 && age <= 42
                && salary >= 53000 && salary <= 65000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Андрей"
Age: от 41 до 42
Salary: от 53000 руб до 65000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 2 года*/