package org.example.newtest.Response;

public class Response541 {
    public static boolean test541(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 26 && age <= 29
                && salary >= 42000 && salary <= 63000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 26 до 29
Salary: от 42000 руб до 63000 руб
Country: "Испания"
Gender: "Женский"
Experience: 3 года*/