package org.example.newtest.Response;

public class Response789 {
    public static boolean test789(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 26 && age <= 28
                && salary >= 39000 && salary <= 49000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Оксана"
Age: от 26 до 28
Salary: от 39000 руб до 49000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 10 лет*/