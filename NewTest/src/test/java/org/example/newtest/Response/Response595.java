package org.example.newtest.Response;

public class Response595 {
    public static boolean test595(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 20 && age <= 22
                && salary >= 28000 && salary <= 33000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 20 до 22
Salary: от 28000 руб до 33000 руб
Country: "Испания"
Gender: "Женский"
Experience: 2 года*/