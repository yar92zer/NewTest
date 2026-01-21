package org.example.newtest.Response;

public class Response796 {
    public static boolean test776(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 36 && age <= 44
                && salary >= 23000 && salary <= 35000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Сергей"
Age: от 36 до 44
Salary: от 23000 руб до 35000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 1 год*/