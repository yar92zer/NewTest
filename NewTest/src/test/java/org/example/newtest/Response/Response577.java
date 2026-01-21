package org.example.newtest.Response;

public class Response577 {
    public static boolean test577(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 24 && age <= 40
                && salary >= 29000 && salary <= 51000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женская")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 24 до 40
Salary: от 29000 руб до 51000 руб
Country: "Франция"
Gender: "Женский"
Experience: 11 лет*/