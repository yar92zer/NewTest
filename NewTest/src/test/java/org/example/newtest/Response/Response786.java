package org.example.newtest.Response;

public class Response786 {
    public static boolean test786(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 35 && age <= 36
                && salary >= 26000 && salary <= 29000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Виктория"
Age: от 35 до 36
Salary: от 26000 руб до 29000 руб
Country: "Франция"
Gender: "Женский"
Experience: 4 года*/