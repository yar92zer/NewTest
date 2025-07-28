package org.example.newtest.Response;

public class Response306 {
    public static boolean test306(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 35 && age <= 37
                && salary >= 22000 && salary <= 23000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 35 до 37
Salary: от 22000 руб до 23000 руб
Country: "Испания"
Gender: "Женский"
Experience: 8 лет*/