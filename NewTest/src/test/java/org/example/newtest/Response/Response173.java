package org.example.newtest.Response;

public class Response173 {
    public static boolean test173(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 25 && age <= 32
                && salary >= 31000 && salary <= 33000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 25 до 32
Salary: от 31000 руб до 33000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 13 лет*/