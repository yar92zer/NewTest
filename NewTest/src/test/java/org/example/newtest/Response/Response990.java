package org.example.newtest.Response;

public class Response990 {
    public static boolean test990(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 32 && age <= 34
                && salary >= 57000 && salary <= 60000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Виктория"
Age: от 32 до 34
Salary: от 57000 руб до 60000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 6 лет*/