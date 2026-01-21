package org.example.newtest.Response;

public class Response727 {
    public static boolean test727(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 37 && age <= 46
                && salary >= 25000 && salary <= 29000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Юлия"
Age: от 37 до 46
Salary: от 25000 руб до 29000 руб
Country: "Испания"
Gender: "Женский"
Experience: 13 лет*/