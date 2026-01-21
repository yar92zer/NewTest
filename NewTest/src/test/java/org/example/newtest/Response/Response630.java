package org.example.newtest.Response;

public class Response630 {
    public static boolean test630(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизовета")
                && age >= 21 && age <= 31
                && salary >= 21000 && salary <= 38000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 21 до 31
Salary: от 21000 руб до 38000 руб
Country: "Франция"
Gender: "Женский"
Experience: 10 лет*/