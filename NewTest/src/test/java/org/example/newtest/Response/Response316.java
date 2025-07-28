package org.example.newtest.Response;

public class Response316 {
    public static boolean test316(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 38 && age <= 56
                && salary >= 21000 && salary <= 30000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 38 до 56
Salary: от 21000 руб до 30000 руб
Country: "Польша"
Gender: "Женский"
Experience: 12 лет*/