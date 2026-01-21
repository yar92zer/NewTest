package org.example.newtest.Response;

public class Response555 {
    public static boolean test555(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 33 && age <= 36
                && salary >= 30000 && salary <= 43000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 33 до 36
Salary: от 30000 руб до 43000 руб
Country: "Испания"
Gender: "Женский"
Experience: 5 лет*/