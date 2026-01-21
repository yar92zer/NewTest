package org.example.newtest.Response;

public class Response592 {
    public static boolean test592(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 21 && age <= 22
                && salary >= 30000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 21 до 22
Salary: от 30000 руб до 36000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 2 года*/