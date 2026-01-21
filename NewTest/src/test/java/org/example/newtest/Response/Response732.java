package org.example.newtest.Response;

public class Response732 {
    public static boolean test732(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 63 && age <= 64
                && salary >= 25000 && salary <= 33000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Оксана"
Age: от 63 до 64
Salary: от 25000 руб до 33000 руб
Country: "Испания"
Gender: "Женский"
Experience: 12 лет*/