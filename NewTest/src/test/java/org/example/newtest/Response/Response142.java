package org.example.newtest.Response;

public class Response142 {
    public static boolean test142(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 19 && age <= 22
                && salary >= 21000 && salary <= 27000
                && country.equalsIgnoreCase("Нидерлады")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 19 до 22
Salary: от 21000 руб до 27000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 2 года*/