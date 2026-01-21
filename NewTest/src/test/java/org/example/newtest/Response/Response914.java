package org.example.newtest.Response;

public class Response914 {
    public static boolean test914(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 23 && age <= 28
                && salary >= 35000 && salary <= 63000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Оксана"
Age: от 23 до 28
Salary: от 35000 руб до 63000 руб
Country: "Польша"
Gender: "Женский"
Experience: 2 года*/