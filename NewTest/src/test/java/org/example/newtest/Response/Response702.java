package org.example.newtest.Response;

public class Response702 {
    public static boolean test702(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 33 && age <= 35
                && salary >= 25000 && salary <= 28000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Андрей"
Age: от 33 до 35
Salary: от 25000 руб до 28000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 12 лет*/