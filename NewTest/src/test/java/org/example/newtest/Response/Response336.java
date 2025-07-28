package org.example.newtest.Response;

public class Response336 {
    public static boolean test336(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 21 && age <= 25
                && salary >= 23000 && salary <= 30000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 21 до 25
Salary: от 23000 руб до 30000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 2 года*/