package org.example.newtest.Response;

public class Response358 {
    public static boolean test358(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 36 && age <= 45
                && salary >= 23000 && salary <= 30000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 36 до 45
Salary: от 23000 руб до 30000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/