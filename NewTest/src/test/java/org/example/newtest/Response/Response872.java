package org.example.newtest.Response;

public class Response872 {
    public static boolean test872(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 39 && age <= 52
                && salary >= 30000 && salary <= 44000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Наталья"
Age: от 39 до 52
Salary: от 30000 руб до 44000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 1 год*/