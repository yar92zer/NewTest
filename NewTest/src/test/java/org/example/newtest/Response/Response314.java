package org.example.newtest.Response;

public class Response314 {
    public static boolean test314(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 23 && age <= 24
                && salary >= 66000 && salary <= 67000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 23 до 24
Salary: от 66000 руб до 67000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 6 лет*/