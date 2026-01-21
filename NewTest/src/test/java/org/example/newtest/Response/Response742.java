package org.example.newtest.Response;

public class Response742 {
    public static boolean test742(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 30 && age <= 37
                && salary >= 24000 && salary <= 30000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Максим"
Age: от 30 до 37
Salary: от 24000 руб до 30000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 3 года*/