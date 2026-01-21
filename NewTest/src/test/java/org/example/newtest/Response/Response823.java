package org.example.newtest.Response;

public class Response823 {
    public static boolean test823(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 27 && age <= 38
                && salary >= 33000 && salary <= 34000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Анна"
Age: от 27 до 38
Salary: от 33000 руб до 34000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 5 лет*/