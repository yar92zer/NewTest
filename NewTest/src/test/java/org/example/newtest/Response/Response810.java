package org.example.newtest.Response;

public class Response810 {
    public static boolean test810(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 20 && age <= 27
                && salary >= 50000 && salary <= 66000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Алина"
Age: от 20 до 27
Salary: от 50000 руб до 66000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 8 лет*/