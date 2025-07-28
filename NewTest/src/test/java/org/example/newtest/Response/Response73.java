package org.example.newtest.Response;

public class Response73 {
    public static boolean test73(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 18 && age <= 20
                && salary >= 32000 && salary <= 35000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 18 до 20
Salary: от 32000 руб до 35000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 1 год*/