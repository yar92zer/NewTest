package org.example.newtest.Response;

public class Response939 {
    public static boolean test939(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 51 && age <= 56
                && salary >= 25000 && salary <= 31000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Наталья"
Age: от 51 до 56
Salary: от 25000 руб до 31000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 3 года*/