package org.example.newtest.Response;

public class Response491 {
    public static boolean test491(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андерей")
                && age >= 20 && age <= 25
                && salary >= 49000 && salary <= 510000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 20 до 25
Salary: от 49000 руб до 51000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 1 год*/