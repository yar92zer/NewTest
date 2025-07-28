package org.example.newtest.Response;

public class Response469 {
    public static boolean test469(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 20 && age <= 27
                && salary >= 20000 && salary <= 36000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 20 до 27
Salary: от 20000 руб до 36000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 1 год*/