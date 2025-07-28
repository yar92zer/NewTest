package org.example.newtest.Response;

public class Response66 {
    public static boolean test66(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 20 && age <= 25
                && salary >= 26000 && salary <= 45000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 20 до 25
Salary: от 26000 руб до 45000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 5 лет*/