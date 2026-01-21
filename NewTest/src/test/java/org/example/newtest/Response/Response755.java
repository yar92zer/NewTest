package org.example.newtest.Response;

public class Response755 {
    public static boolean test755(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 35 && age <= 37
                && salary >= 65000 && salary <= 66000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Светлана"
Age: от 35 до 37
Salary: от 65000 руб до 66000 руб
Country: "Польша"
Gender: "Женский"
Experience: 6 лет*/