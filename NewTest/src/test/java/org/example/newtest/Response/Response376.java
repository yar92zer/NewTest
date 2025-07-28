package org.example.newtest.Response;

public class Response376 {
    public static boolean test376(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 21 && age <= 30
                && salary >= 23000 && salary <= 54000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 21 до 30
Salary: от 23000 руб до 54000 руб
Country: "Польша"
Gender: "Женский"
Experience: 11 лет*/