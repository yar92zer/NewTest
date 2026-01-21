package org.example.newtest.Response;

public class Response581 {
    public static boolean test581(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 20 && age <= 26
                && salary >= 20000 && salary <= 30000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 20 до 26
Salary: от 20000 руб до 30000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 7 лет*/