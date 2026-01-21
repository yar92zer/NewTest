package org.example.newtest.Response;

public class Response972 {
    public static boolean test972(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 22 && age <= 23
                && salary >= 32000 && salary <= 59000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Иван"
Age: от 22 до 23
Salary: от 32000 руб до 59000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 1 год*/