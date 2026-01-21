package org.example.newtest.Response;

public class Response799 {
    public static boolean test799(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 24 && age <= 32
                && salary >= 49000 && salary <= 54000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Дмитрий"
Age: от 24 до 32
Salary: от 49000 руб до 54000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 12 лет*/