package org.example.newtest.Response;

public class Response494 {
    public static boolean test494(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 23 && age <= 55
                && salary >= 30000 && salary <= 31000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 23 до 55
Salary: от 30000 руб до 31000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 12 лет*/