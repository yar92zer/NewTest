package org.example.newtest.Response;

public class Response192 {
    public static boolean test192(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 37 && age <= 45
                && salary >= 21000 && salary <= 37000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 37 до 45
Salary: от 21000 руб до 37000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 12 лет*/