package org.example.newtest.Response;

public class Response782 {
    public static boolean test782(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 23 && age <= 31
                && salary >= 30000 && salary <= 39000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Иван"
Age: от 23 до 31
Salary: от 30000 руб до 39000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 9 лет*/