package org.example.newtest.Response;

public class Response471 {
    public static boolean test471(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 53 && age <= 56
                && salary >= 55000 && salary <= 56000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 53 до 56
Salary: от 55000 руб до 56000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/