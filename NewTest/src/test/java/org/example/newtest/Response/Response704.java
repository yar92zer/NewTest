package org.example.newtest.Response;

public class Response704 {
    public static boolean test704(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 24 && age <= 30
                && salary >= 36000 && salary <= 37000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Оксана"
Age: от 24 до 30
Salary: от 36000 руб до 37000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 3 года*/