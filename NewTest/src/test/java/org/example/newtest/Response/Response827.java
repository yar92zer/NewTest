package org.example.newtest.Response;

public class Response827 {
    public static boolean tets(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 27 && age <= 30
                && salary >= 39000 && salary <= 55000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Артем"
Age: от 27 до 30
Salary: от 39000 руб до 55000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 3 года*/