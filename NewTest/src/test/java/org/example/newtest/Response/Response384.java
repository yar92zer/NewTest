package org.example.newtest.Response;

public class Response384 {
    public static boolean test384(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 46 && age <= 51
                && salary >= 28000 && salary <= 47000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 46 до 51
Salary: от 28000 руб до 47000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 3 года*/