package org.example.newtest.Response;

public class Response852 {
    public static boolean test852(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 32 && age <= 38
                && salary >= 51000 && salary <= 64000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Андрей"
Age: от 32 до 38
Salary: от 51000 руб до 64000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 4 года*/