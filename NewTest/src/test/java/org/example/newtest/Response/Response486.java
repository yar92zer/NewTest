package org.example.newtest.Response;

public class Response486 {
    public static boolean test386(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 26 && age <= 29
                && salary >= 48000 && salary <= 50000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женккий")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 26 до 29
Salary: от 48000 руб до 50000 руб
Country: "Испания"
Gender: "Женский"
Experience: 10 лет*/