package org.example.newtest.Response;

public class Response689 {
    public static boolean test689(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 19 && age <= 58
                && salary >= 22000 && salary <= 23000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Светлана"
Age: от 19 до 58
Salary: от 22000 руб до 23000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 лет*/