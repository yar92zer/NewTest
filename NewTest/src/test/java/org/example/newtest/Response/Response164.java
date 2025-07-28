package org.example.newtest.Response;

public class Response164 {
    public static boolean test164(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 21 && age <= 24
                && salary >= 32000 && salary <= 37000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 21 до 24
Salary: от 32000 руб до 37000 руб
Country: "Испания"
Gender: "Женский"
Experience: 4 года*/