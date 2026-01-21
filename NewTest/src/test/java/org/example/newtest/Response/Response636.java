package org.example.newtest.Response;

public class Response636 {
    public static boolean test636(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 52 && age <= 58
                && salary >= 35000 && salary <= 41000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 52 до 58
Salary: от 35000 руб до 41000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/