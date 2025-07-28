package org.example.newtest.Response;

public class Response433 {
    public static boolean test(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Света")
                && age >= 22 && age <= 34
                && salary >= 39000 && salary <= 58000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 22 до 34
Salary: от 39000 руб до 58000 руб
Country: "Испания"
Gender: "Женский"
Experience: 12 лет*/