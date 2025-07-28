package org.example.newtest.Response;

public class Response484 {
    public static boolean test484(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 41 && age <= 51
                && salary >= 32000 && salary <= 34000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 41 до 51
Salary: от 32000 руб до 34000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/