package org.example.newtest.Response;

public class Response557 {
    public static boolean test557(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 24 && age <= 30
                && salary >= 35000 && salary <= 38000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 24 до 30
Salary: от 35000 руб до 38000 руб
Country: "Франция"
Gender: "Женский"
Experience: 12 лет*/