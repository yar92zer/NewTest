package org.example.newtest.Response;

public class Response992 {
    public static boolean test992(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 29 && age <= 36
                && salary >= 32000 && salary <= 40000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Егор"
Age: от 29 до 36
Salary: от 32000 руб до 40000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/