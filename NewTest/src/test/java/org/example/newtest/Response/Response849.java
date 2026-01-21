package org.example.newtest.Response;

public class Response849 {
    public static boolean test849(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 37 && age <= 39
                && salary >= 45000 && salary <= 46000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Светлана"
Age: от 37 до 39
Salary: от 45000 руб до 46000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/