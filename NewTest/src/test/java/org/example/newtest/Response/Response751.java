package org.example.newtest.Response;

public class Response751 {
    public static boolean test751(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 22 && age <= 29
                && salary >= 48000 && salary <= 49000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Юлия"
Age: от 22 до 29
Salary: от 48000 руб до 49000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 2 года*/