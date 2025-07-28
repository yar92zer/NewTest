package org.example.newtest.Response;

public class Response295 {
    public static boolean test295(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 34 && age <= 41
                && salary >= 21000 && salary <= 55000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 34 до 41
Salary: от 21000 руб до 55000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 11 лет*/