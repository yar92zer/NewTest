package org.example.newtest.Response;

public class Response880 {
    public static boolean test880(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 44 && age <= 45
                && salary >= 20000 && salary <= 30000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Светлана"
Age: от 44 до 45
Salary: от 20000 руб до 30000 руб
Country: "Испания"
Gender: "Женский"
Experience: 5 лет*/