package org.example.newtest.Response;

public class Response821 {
    public static boolean test821(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 25 && age <= 46
                && salary >= 40000 && salary <= 41000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Михаил"
Age: от 25 до 46
Salary: от 40000 руб до 41000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 15 лет*/