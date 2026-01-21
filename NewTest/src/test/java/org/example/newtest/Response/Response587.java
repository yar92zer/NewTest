package org.example.newtest.Response;

public class Response587 {
    public static boolean test587(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 21 && age <= 31
                && salary >= 25000 && salary <= 34000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 21 до 31
Salary: от 25000 руб до 34000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 13 лет*/