package org.example.newtest.Response;

public class Response947 {
    public static boolean test947(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 18 && age <= 46
                && salary >= 22000 && salary <= 24000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Михаил"
Age: от 18 до 46
Salary: от 22000 руб до 24000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 6 лет*/