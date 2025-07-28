package org.example.newtest.Response;

public class Response288 {
    public static boolean test288(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 25 && age <= 29
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return false;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 25 до 29
Salary: от 27000 руб до 29000 руб
Country: "Испания"
Gender: "Женский"
Experience: 6 лет*/