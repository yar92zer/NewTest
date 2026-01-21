package org.example.newtest.Response;

public class Response776 {
    public static boolean test776(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 42 && age <= 46
                && salary >= 27000 && salary <= 47000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Мария"
Age: от 42 до 46
Salary: от 27000 руб до 47000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 7 лет*/