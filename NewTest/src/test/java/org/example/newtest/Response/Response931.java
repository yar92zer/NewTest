package org.example.newtest.Response;

public class Response931 {
    public static boolean test931(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Мария")
                && age >= 37 && age <= 40
                && salary >= 54000 && salary <= 59000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Мария"
Age: от 37 до 40
Salary: от 54000 руб до 59000 руб
Country: "Германия"
Gender: "Женский"
Experience: 1 год*/