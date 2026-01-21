package org.example.newtest.Response;

public class Response738 {
    public static boolean test738(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 35 && age <= 58
                && salary >= 38000 && salary <= 43000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Виктория"
Age: от 35 до 58
Salary: от 38000 руб до 43000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/