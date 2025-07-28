package org.example.newtest.Response;

public class Response472 {
    public static boolean test472(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 22 && age <= 25
                && salary >= 21000 && salary <= 31000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 22 до 25
Salary: от 21000 руб до 31000 руб
Country: "Польша"
Gender: "Женский"
Experience: 3 года*/