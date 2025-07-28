package org.example.newtest.Response;

public class Response122 {
    public static boolean test122(String name, int age, int salary, String gender, String country, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 25 && age <= 29
                && salary >= 40000 && salary <= 50000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 25 до 29
Salary: от 40000 руб до 50000 руб
Country: "Испания"
Gender: "Женский"
Experience: 8 лет*/