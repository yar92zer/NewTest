package org.example.newtest.Response;

public class Response304 {
    public static boolean test304(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 43 && age <= 60
                && salary >= 62000 && salary <= 65000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 43 до 60
Salary: от 62000 руб до 65000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 7 лет*/