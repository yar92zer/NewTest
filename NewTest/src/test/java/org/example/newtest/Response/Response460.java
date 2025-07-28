package org.example.newtest.Response;

public class Response460 {
    public static boolean test460(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 28 && age <= 34
                && salary >= 29000 && salary <= 40000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 28 до 34
Salary: от 29000 руб до 40000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 3 года*/