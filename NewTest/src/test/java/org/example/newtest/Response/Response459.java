package org.example.newtest.Response;

public class Response459 {
    public static boolean test459(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 44 && age <= 45
                && salary >= 27000 && salary <= 30000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 44 до 45
Salary: от 27000 руб до 30000 руб
Country: "Испания"
Gender: "Женский"
Experience: 15 лет*/