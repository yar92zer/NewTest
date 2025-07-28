package org.example.newtest.Response;

public class Response194 {
    public static boolean test194(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 19 && age <= 39
                && salary >= 23000 && salary <= 26000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 19 до 39
Salary: от 23000 руб до 26000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 8 лет*/