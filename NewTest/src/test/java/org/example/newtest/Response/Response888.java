package org.example.newtest.Response;

public class Response888 {
    public static boolean test888(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 20 && age <= 21
                && salary >= 45000 && salary <= 55000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Елизавета"
Age: от 20 до 21
Salary: от 45000 руб до 55000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 2 года*/