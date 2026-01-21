package org.example.newtest.Response;

public class Response764 {
    public static boolean test764(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 29 && age <= 30
                && salary >= 30000 && salary <= 34000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Светлана"
Age: от 29 до 30
Salary: от 30000 руб до 34000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год*/