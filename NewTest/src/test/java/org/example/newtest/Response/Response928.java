package org.example.newtest.Response;

public class Response928 {
    public static boolean test928(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 29 && age <= 37
                && salary >= 32000 && salary <= 54000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Виктория"
Age: от 29 до 37
Salary: от 32000 руб до 54000 руб
Country: "Германия"
Gender: "Женский"
Experience: 9 лет*/