package org.example.newtest.Response;

public class Response441 {
    public static boolean test441(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктор")
                && age >= 48 && age <= 51
                && salary >= 25000 && salary <= 40000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 48 до 51
Salary: от 25000 руб до 40000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 5 лет*/