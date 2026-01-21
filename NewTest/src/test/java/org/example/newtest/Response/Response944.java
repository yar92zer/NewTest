package org.example.newtest.Response;

public class Response944 {
    public static boolean test944(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 28 && age <= 33
                && salary >= 31000 && salary <= 34000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Максим"
Age: от 28 до 33
Salary: от 31000 руб до 34000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 15 лет*/