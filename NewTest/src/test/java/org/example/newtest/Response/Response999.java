package org.example.newtest.Response;

public class Response999 {
    public static boolean test999(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Ивана")
                && age >= 20 && age <= 24
                && salary >= 46000 && salary <= 49000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Иван"
Age: от 20 до 24
Salary: от 46000 руб до 49000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 2 года*/