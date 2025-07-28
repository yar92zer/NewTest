package org.example.newtest.Response;

public class Response96 {
    public static boolean test96(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 18 && age <= 40
                && salary >= 39000 && salary <= 49000
                && country.equalsIgnoreCase("Нидерладнды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 18 до 40
Salary: от 39000 руб до 49000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/