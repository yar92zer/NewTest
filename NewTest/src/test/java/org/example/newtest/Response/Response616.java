package org.example.newtest.Response;

public class Response616 {
    public static boolean test616(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 26 && age <= 27
                && salary >= 28000 && salary <= 30000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 26 до 27
Salary: от 28000 руб до 30000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 2 года*/