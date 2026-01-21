package org.example.newtest.Response;

public class Response807 {
    public static boolean test807(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 34 && age <= 36
                && salary >= 52000 && salary <= 54000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Елизавета"
Age: от 34 до 36
Salary: от 52000 руб до 54000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/