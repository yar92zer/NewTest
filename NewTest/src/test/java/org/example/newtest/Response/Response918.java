package org.example.newtest.Response;

public class Response918 {
    public static boolean test918(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 34 && age <= 44
                && salary >= 20000 && salary <= 39000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Екатерина"
Age: от 34 до 44
Salary: от 20000 руб до 39000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 4 года*/