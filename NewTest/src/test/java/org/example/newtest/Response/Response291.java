package org.example.newtest.Response;

public class Response291 {
    public static boolean test291(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 44 && age <= 51
                && salary >= 32000 && salary <= 36000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 44 до 51
Salary: от 32000 руб до 36000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 7 лет*/