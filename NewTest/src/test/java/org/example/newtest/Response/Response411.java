package org.example.newtest.Response;

public class Response411 {
    public static boolean test411(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 58 && age <= 64
                && salary >= 32000 && salary <= 36000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 58 до 64
Salary: от 32000 руб до 36000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 10 лет*/