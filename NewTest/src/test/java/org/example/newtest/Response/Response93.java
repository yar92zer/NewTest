package org.example.newtest.Response;

public class Response93 {
    public static boolean test93(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 29 && age <= 44
                && salary >= 37000 && salary <= 49000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 29 до 44
Salary: от 37000 руб до 49000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/