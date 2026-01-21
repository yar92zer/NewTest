package org.example.newtest.Response;

public class Response693 {
    public static boolean test693(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 22 && age <= 23
                && salary >= 39000 && salary <= 43000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Николай"
Age: от 22 до 23
Salary: от 39000 руб до 43000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 2 года*/