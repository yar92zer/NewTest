package org.example.newtest.Response;

public class Response718 {
    public static boolean test710(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 35 && age <= 39
                && salary >= 30000 && salary <= 39000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Алина"
Age: от 35 до 39
Salary: от 30000 руб до 39000 руб
Country: "Испания"
Gender: "Женский"
Experience: 8 лет*/