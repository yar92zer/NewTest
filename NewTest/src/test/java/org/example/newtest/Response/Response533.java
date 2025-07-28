package org.example.newtest.Response;

public class Response533 {
    public static boolean test533(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 34 && age <= 56
                && salary >= 32000 && salary <= 36000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 34 до 56
Salary: от 32000 руб до 36000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 15 лет*/