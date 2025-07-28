package org.example.newtest.Response;

public class Response176 {
    public static boolean test176(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 31 && age <= 35
                && salary >= 39000 && salary <= 68000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 31 до 35
Salary: от 39000 руб до 68000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 2 года*/