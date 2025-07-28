package org.example.newtest.Response;

public class Response507 {
    public static boolean test507(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 28 && age <= 29
                && salary >= 20000 && salary <= 37000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 28 до 29
Salary: от 20000 руб до 37000 руб
Country: "Франция"
Gender: "Женский"
Experience: 7 лет*/