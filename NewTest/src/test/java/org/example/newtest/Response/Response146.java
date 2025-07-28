package org.example.newtest.Response;

public class Response146 {
    public static boolean test146(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 35 && age <= 64
                && salary >= 26000 && salary <= 29000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 35 до 64
Salary: от 26000 руб до 29000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 14 лет*/