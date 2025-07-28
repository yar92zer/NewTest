package org.example.newtest.Response;

public class Response363 {
    public static boolean test363(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 28 && age <= 53
                && salary >= 24000 && salary <= 27000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 28 до 53
Salary: от 24000 руб до 27000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 12 лет*/