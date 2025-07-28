package org.example.newtest.Response;

public class Response405 {
    public static boolean test405(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 21 && age <= 27
                && salary >= 58000 && salary <= 59000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 21 до 27
Salary: от 58000 руб до 59000 руб
Country: "Испания"
Gender: "Женский"
Experience: 2 года*/