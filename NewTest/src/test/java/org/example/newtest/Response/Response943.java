package org.example.newtest.Response;

public class Response943 {
    public static boolean test943(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 52 && age <= 53
                && salary >= 43000 && salary <= 44000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Юлия"
Age: от 52 до 53
Salary: от 43000 руб до 44000 руб
Country: "Испания"
Gender: "Женский"
Experience: 14 лет*/