package org.example.newtest.Response;

public class Response635 {
    public static boolean test635(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 46 && age <= 49
                && salary >= 33000 && salary <= 36000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 46 до 49
Salary: от 33000 руб до 36000 руб
Country: "Испания"
Gender: "Женский"
Experience: 1 год*/