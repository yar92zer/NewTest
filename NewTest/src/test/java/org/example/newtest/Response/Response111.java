package org.example.newtest.Response;

public class Response111 {
    public static boolean test111(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 20 && age <= 21
                && salary >= 55000 && salary <= 55001
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 20 до 21
Salary: от 55000 руб до 55001 руб
Country: "Испания"
Gender: "Женский"
Experience: 1 год*/