package org.example.newtest.Response;

public class Response64 {
    public static boolean test64(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 23 && age <= 36
                && salary >= 32000 && salary <= 38000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 23 до 36
Salary: от 32000 руб до 38000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 1 год*/