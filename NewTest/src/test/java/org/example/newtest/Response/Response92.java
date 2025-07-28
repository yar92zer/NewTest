package org.example.newtest.Response;

public class Response92 {
    public static boolean test92(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 33 && age <= 45
                && salary >= 29000 && salary <= 43000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 33 до 45
Salary: от 29000 руб до 43000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 8 лет*/