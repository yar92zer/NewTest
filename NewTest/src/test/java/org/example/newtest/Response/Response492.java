package org.example.newtest.Response;

public class Response492 {
    public static boolean test492(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 46 && age <= 48
                && salary >= 22000 && salary <= 37000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 46 до 48
Salary: от 22000 руб до 37000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 8 лет*/