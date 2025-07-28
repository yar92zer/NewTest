package org.example.newtest.Response;

public class Response398 {
    public static boolean test398(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 18 && age <= 39
                && salary >= 22000 && salary <= 35000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 18 до 39
Salary: от 22000 руб до 35000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 14 лет*/