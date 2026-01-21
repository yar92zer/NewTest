package org.example.newtest.Response;

public class Response713 {
    public static boolean test713(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 25 && age <= 49
                && salary >= 34000 && salary <= 37000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Александр"
Age: от 25 до 49
Salary: от 34000 руб до 37000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/