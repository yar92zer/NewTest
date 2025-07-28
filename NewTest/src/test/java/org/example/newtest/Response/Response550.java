package org.example.newtest.Response;

public class Response550 {
    public static boolean test550(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктор")
                && age >= 20 && age <= 45
                && salary >= 31000 && salary <= 46000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 20 до 45
Salary: от 31000 руб до 46000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/