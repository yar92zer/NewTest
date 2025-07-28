package org.example.newtest.Response;

public class Response151 {
    public static boolean test151(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 31 && age <= 53
                && salary >= 20000 && salary <= 27000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 31 до 53
Salary: от 20000 руб до 27000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 4 года*/