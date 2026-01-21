package org.example.newtest.Response;

public class Response767 {
    public static boolean test767(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 49 && age <= 55
                && salary >= 29000 && salary <= 39000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Виктория"
Age: от 49 до 55
Salary: от 29000 руб до 39000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 2 года*/