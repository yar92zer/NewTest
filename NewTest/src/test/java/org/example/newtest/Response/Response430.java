package org.example.newtest.Response;

public class Response430 {
    public static boolean test430(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 32 && age <= 41
                && salary >= 27000 && salary <= 31000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 32 до 41
Salary: от 27000 руб до 31000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 8 лет*/