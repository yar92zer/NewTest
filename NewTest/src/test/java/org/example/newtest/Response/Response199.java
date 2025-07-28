package org.example.newtest.Response;

public class Response199 {
    public static boolean test199(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 36 && age <= 47
                && salary >= 20000 && salary <= 34000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 36 до 47
Salary: от 20000 руб до 34000 руб
Country: "Италия"
Gender: "Женский"
Experience: 13 лет*/