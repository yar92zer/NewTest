package org.example.newtest.Response;

public class Response777 {
    public static boolean test777(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 29 && age <= 34
                && salary >= 55000 && salary <= 56000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Артем"
Age: от 29 до 34
Salary: от 55000 руб до 56000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/