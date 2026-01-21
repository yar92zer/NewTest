package org.example.newtest.Response;

public class Response622 {
    public static boolean test622(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 18 && age <= 20
                && salary >= 36000 && salary <= 52000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 18 до 20
Salary: от 36000 руб до 52000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 2 года*/