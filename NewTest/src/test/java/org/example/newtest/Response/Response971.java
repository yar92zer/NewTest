package org.example.newtest.Response;

public class Response971 {
    public static boolean test971(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 28 && age <= 38
                && salary >= 40000 && salary <= 44000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Андрей"
Age: от 28 до 38
Salary: от 40000 руб до 44000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 1 год*/