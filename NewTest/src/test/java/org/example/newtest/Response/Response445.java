package org.example.newtest.Response;

public class Response445 {
    public static boolean test445(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 25 && age <= 33
                && salary >= 33000 && salary <= 48000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 25 до 33
Salary: от 33000 руб до 48000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 13 лет*/