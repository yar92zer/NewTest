package org.example.newtest.Response;

public class Response876 {
    public static boolean test876(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 20 && age <= 36
                && salary >= 46000 && salary <= 56000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Артем"
Age: от 20 до 36
Salary: от 46000 руб до 56000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/