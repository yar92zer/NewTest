package org.example.newtest.Response;

public class Response435 {
    public static boolean test435(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 22 && age <= 29
                && salary >= 38000 && salary <= 44000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 22 до 29
Salary: от 38000 руб до 44000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 5 лет*/