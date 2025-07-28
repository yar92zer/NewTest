package org.example.newtest.Response;

public class Response292 {
    public static boolean test292(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 31 && age <= 45
                && salary >= 47000 && salary <= 50000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 31 до 45
Salary: от 47000 руб до 50000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 11 лет*/