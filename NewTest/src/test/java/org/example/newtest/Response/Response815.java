package org.example.newtest.Response;

public class Response815 {
    public static boolean test815(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 22 && age <= 40
                && salary >= 43000 && salary <= 46000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Оксана"
Age: от 22 до 40
Salary: от 43000 руб до 46000 руб
Country: "Испания"
Gender: "Женский"
Experience: 9 лет*/