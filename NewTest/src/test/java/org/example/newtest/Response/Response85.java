package org.example.newtest.Response;

public class Response85 {
    public static boolean test85(String name, int age, int salary, String country, String gender, int experinence) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 27 && age <= 32
                && salary >= 39000 && salary <= 40000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experinence == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 27 до 32
Salary: от 39000 руб до 40000 руб
Country: "Испания"
Gender: "Женский"
Experience: 8 лет*/