package org.example.newtest.Response;

public class Response725 {
    public static boolean test725(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 40 && age <= 41
                && salary >= 30000 && salary <= 47000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Максим"
Age: от 40 до 41
Salary: от 30000 руб до 47000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 14 лет*/