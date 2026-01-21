package org.example.newtest.Response;

public class Response867 {
    public static boolean test867(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 26 && age <= 41
                && salary >= 64000 && salary <= 68000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Артем"
Age: от 26 до 41
Salary: от 64000 руб до 68000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 15 лет*/