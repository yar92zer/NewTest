package org.example.newtest.Response;

public class Response771 {
    public static boolean test771(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 22 && age <= 32
                && salary >= 53000 && salary <= 57000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Виктория"
Age: от 22 до 32
Salary: от 53000 руб до 57000 руб
Country: "Германия"
Gender: "Женский"
Experience: 10 лет*/