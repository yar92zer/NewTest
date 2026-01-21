package org.example.newtest.Response;

public class Response598 {
    public static boolean test598(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 32 && age <= 36
                && salary >= 36000 && salary <= 41000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 32 до 36
Salary: от 36000 руб до 41000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 8 лет*/