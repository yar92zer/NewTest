package org.example.newtest.Response;

public class Response956 {
    public static boolean test956(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавет")
                && age >= 29 && age <= 37
                && salary >= 46000 && salary <= 56000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Елизавета"
Age: от 29 до 37
Salary: от 46000 руб до 56000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 3 года*/