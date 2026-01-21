package org.example.newtest.Response;

public class Response788 {
    public static boolean test788(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 24 && age <= 44
                && salary >= 34000 && salary <= 38000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Светлана"
Age: от 24 до 44
Salary: от 34000 руб до 38000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 5 лет*/