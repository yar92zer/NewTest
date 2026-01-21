package org.example.newtest.Response;

public class Response925 {
    public static boolean test925(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 18 && age <= 24
                && salary >= 20000 && salary <= 25000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Виктория"
Age: от 18 до 24
Salary: от 20000 руб до 25000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/