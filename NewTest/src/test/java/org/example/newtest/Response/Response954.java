package org.example.newtest.Response;

public class Response954 {
    public static boolean test954(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 19 && age <= 29
                && salary >= 36000 && salary <= 60000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Юлия"
Age: от 19 до 29
Salary: от 36000 руб до 60000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 9 лет*/