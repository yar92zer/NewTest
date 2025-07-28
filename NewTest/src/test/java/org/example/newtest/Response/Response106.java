package org.example.newtest.Response;

public class Response106 {
    public static boolean test106(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Света")
                && age >= 21 && age <= 26
                && salary >= 28000 && salary <= 36000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 21 до 26
Salary: от 28000 руб до 36000 руб
Country: "Испания"
Gender: "Женский"
Experience: 2 года*/