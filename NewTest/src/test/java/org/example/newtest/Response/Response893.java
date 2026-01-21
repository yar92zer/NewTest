package org.example.newtest.Response;

public class Response893 {
    public static boolean test893(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 24 && age <= 26
                && salary >= 20000 && salary <= 25000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Алина"
Age: от 24 до 26
Salary: от 20000 руб до 25000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 2 года*/