package org.example.newtest.Response;

public class Response781 {
    public static boolean test781(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 31 && age <= 32
                && salary >= 20000 && salary <= 21000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Артем"
Age: от 31 до 32
Salary: от 20000 руб до 21000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/