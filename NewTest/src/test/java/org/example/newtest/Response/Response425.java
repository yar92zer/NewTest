package org.example.newtest.Response;

public class Response425 {
    public static boolean test425(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 44 && age <= 55
                && salary >= 52000 && salary <= 53000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 44 до 55
Salary: от 52000 руб до 53000 руб
Country: "Испания"
Gender: "Женский"
Experience: 13 лет*/