package org.example.newtest.Response;

public class Response447 {
    public static boolean test447(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 22 && age <= 30
                && salary >= 66000 && salary <= 68000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 22 до 30
Salary: от 66000 руб до 68000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 4 года*/