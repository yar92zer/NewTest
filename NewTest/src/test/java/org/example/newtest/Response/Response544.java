package org.example.newtest.Response;

public class Response544 {
    public static boolean test544(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 45 && age <= 48
                && salary >= 29000 && salary <= 31000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 45 до 48
Salary: от 29000 руб до 31000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 10 лет*/