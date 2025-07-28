package org.example.newtest.Response;

public class Response420 {
    public static boolean test420(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 46 && age <= 50
                && salary >= 32000 && salary <= 64000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 46 до 50
Salary: от 32000 руб до 64000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 5 лет*/