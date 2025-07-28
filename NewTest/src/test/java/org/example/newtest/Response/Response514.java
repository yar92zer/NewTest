package org.example.newtest.Response;

public class Response514 {
    public static boolean test614(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age <= 25 && age <= 27
                && salary >= 35000 && salary <= 40000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 25 до 27
Salary: от 35000 руб до 40000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 8 лет*/