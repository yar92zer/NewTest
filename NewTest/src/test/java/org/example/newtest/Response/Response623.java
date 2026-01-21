package org.example.newtest.Response;

public class Response623 {
    public static boolean test623(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 27 && age <= 28
                && salary >= 29000 && salary <= 30000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 27 до 28
Salary: от 29000 руб до 30000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 10 лет*/