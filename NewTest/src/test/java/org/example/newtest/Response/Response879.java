package org.example.newtest.Response;

public class Response879 {
    public static boolean test879(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 32 && age <= 44
                && salary >= 22000 && salary <= 37000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Николай"
Age: от 32 до 44
Salary: от 22000 руб до 37000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 7 лет*/