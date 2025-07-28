package org.example.newtest.Response;

public class Response153 {
    public static boolean test153(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 27 && age <= 38
                && salary >= 26000 && salary <= 29000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 27 до 38
Salary: от 26000 руб до 29000 руб
Country: "Германия"
Gender: "Женский"
Experience: 5 лет*/