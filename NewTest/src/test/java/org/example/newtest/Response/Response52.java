package org.example.newtest.Response;

public class Response52 {
    public static boolean test52(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 23 && age <= 37
                && salary >= 34000 && salary <= 38000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 23 до 37
Salary: от 34000 руб до 38000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 5 лет*/