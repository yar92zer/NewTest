package org.example.newtest.Response;

public class Response661 {
    public static boolean test661(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 27 && age <= 33
                && salary >= 37000 && salary <= 42000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Иван"
Age: от 27 до 33
Salary: от 37000 руб до 42000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 15 лет*/