package org.example.newtest.Response;

public class Response583 {
    public static boolean test583(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 29 && age <= 30
                && salary >= 27000 && salary <= 39000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 29 до 30
Salary: от 27000 руб до 39000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 8 лет*/