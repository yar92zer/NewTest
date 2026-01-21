package org.example.newtest.Response;

public class Response657 {
    public static boolean test657(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 34 && age <= 36
                && salary >= 26000 && salary <= 28000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Наталья"
Age: от 34 до 36
Salary: от 26000 руб до 28000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года*/