package org.example.newtest.Response;

public class Response480 {
    public static boolean test480(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 57 && age <= 65
                && salary >= 43000 && salary <= 50000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 57 до 65
Salary: от 43000 руб до 50000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 12 лет*/