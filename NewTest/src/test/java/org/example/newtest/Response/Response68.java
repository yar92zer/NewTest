package org.example.newtest.Response;

public class Response68 {
    public static boolean test68(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 26 && age <= 39
                && salary >= 21000 && salary <= 37000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 26 до 39
Salary: от 21000 руб до 37000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 8 лет*/