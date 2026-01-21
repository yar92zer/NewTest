package org.example.newtest.Response;

public class Response670 {
    public static boolean test670(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 23 && age <= 33
                && salary >= 48000 && salary <= 51000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Оксана"
Age: от 23 до 33
Salary: от 48000 руб до 51000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 15 лет*/