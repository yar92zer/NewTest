package org.example.newtest.Response;

public class Response289 {
    public static boolean test289(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 40 && age <= 48
                && salary >= 20000 && salary <= 27000
                && country.equalsIgnoreCase("Нидерладны")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 40 до 48
Salary: от 20000 руб до 27000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 2 года*/