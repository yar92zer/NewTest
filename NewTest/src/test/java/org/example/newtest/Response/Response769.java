package org.example.newtest.Response;

public class Response769 {
    public static boolean test769(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 29 && age <= 30
                && salary >= 28000 && salary <= 43000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Иван"
Age: от 29 до 30
Salary: от 28000 руб до 43000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 12 лет*/