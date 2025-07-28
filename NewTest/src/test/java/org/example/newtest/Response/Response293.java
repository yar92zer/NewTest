package org.example.newtest.Response;

public class Response293 {
    public static boolean test293(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 26 && age <= 27
                && salary >= 52000 && salary <= 53000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 26 до 27
Salary: от 52000 руб до 53000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/