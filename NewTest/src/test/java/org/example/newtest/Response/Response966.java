package org.example.newtest.Response;

public class Response966 {
    public static boolean test966(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 33 && age <= 36
                && salary >= 21000 && salary <= 27000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Елизавета"
Age: от 33 до 36
Salary: от 21000 руб до 27000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 6 лет*/