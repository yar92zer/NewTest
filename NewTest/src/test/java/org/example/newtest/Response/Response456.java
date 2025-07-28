package org.example.newtest.Response;

public class Response456 {
    public static boolean test456(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 19 && age <= 46
                && salary >= 27000 && salary <= 67000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 19 до 46
Salary: от 27000 руб до 67000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/