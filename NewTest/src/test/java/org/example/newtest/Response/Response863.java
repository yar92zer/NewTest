package org.example.newtest.Response;

public class Response863 {
    public static boolean test863(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 27 && age <= 29
                && salary >= 40000 && salary <= 43000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Николай"
Age: от 27 до 29
Salary: от 40000 руб до 43000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 3 года*/