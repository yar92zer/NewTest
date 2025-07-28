package org.example.newtest.Response;

public class Response63 {
    public static boolean test63(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 32 && age <= 33
                && salary >= 33000 && salary <= 37000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 32 до 33
Salary: от 33000 руб до 37000 руб
Country: "Испания"
Gender: "Женский"
Experience: 15 лет*/