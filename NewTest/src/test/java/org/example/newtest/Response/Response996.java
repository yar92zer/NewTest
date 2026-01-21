package org.example.newtest.Response;

public class Response996 {
    public static boolean test996(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 31 && age <= 40
                && salary >= 23000 && salary <= 36000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Виктория"
Age: от 31 до 40
Salary: от 23000 руб до 36000 руб
Country: "Испания"
Gender: "Женский"
Experience: 1 год*/