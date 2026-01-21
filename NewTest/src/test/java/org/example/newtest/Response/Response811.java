package org.example.newtest.Response;

public class Response811 {
    public static boolean test811(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 36 && age <= 45
                && salary >= 28000 && salary <= 36000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Нидерланды")
                && experience == 2;
    }
}
/*Name: "Артем"
Age: от 36 до 45
Salary: от 28000 руб до 36000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 2 года*/