package org.example.newtest.Response;

public class Response619 {
    public static boolean test619(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 29 && age <= 34
                && salary >= 38000 && salary <= 41000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 29 до 34
Salary: от 38000 руб до 41000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 1 год*/