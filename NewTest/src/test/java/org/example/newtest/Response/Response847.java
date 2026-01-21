package org.example.newtest.Response;

public class Response847 {
    public static boolean test847(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 39 && age <= 42
                && salary >= 33000 && salary <= 42000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Николай"
Age: от 39 до 42
Salary: от 33000 руб до 42000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 2 года*/