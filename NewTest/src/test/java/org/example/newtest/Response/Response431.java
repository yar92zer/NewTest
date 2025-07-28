package org.example.newtest.Response;

public class Response431 {
    public static boolean test431(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 26 && age <= 27
                && salary >= 39000 && salary <= 44000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 26 до 27
Salary: от 39000 руб до 44000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 1 год*/