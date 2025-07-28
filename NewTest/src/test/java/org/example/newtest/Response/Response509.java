package org.example.newtest.Response;

public class Response509 {
    public static boolean test509(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 30 && age <= 34
                && salary >= 44000 && salary <= 45000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 30 до 34
Salary: от 44000 руб до 45000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 9 лет*/