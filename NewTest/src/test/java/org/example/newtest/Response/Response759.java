package org.example.newtest.Response;

public class Response759 {
    public static boolean test759(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 19 && age <= 29
                && salary >= 26000 && salary <= 31000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Андрей"
Age: от 19 до 29
Salary: от 26000 руб до 31000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 9 лет*/