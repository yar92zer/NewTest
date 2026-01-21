package org.example.newtest.Response;

public class Response940 {
    public static boolean test940(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 40 && age <= 50
                && salary >= 48000 && salary <= 54000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Екатерина"
Age: от 40 до 50
Salary: от 48000 руб до 54000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 1 год*/