package org.example.newtest.Response;

public class Response349 {
    public static boolean test349(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 31 && age <= 33
                && salary >= 27000 && salary <= 32000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 31 до 33
Salary: от 27000 руб до 32000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/