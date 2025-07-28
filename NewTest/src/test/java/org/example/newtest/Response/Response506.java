package org.example.newtest.Response;

public class Response506 {
    public static boolean test596(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 23 && age <= 24
                && salary >= 28000 && salary <= 31000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 23 до 24
Salary: от 28000 руб до 31000 руб
Country: "Польша"
Gender: "Женский"
Experience: 6 лет*/