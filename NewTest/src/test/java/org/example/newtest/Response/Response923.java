package org.example.newtest.Response;

public class Response923 {
    public static boolean test923(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 22 && age <= 26
                && salary >= 35000 && salary <= 36000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Анна"
Age: от 22 до 26
Salary: от 35000 руб до 36000 руб
Country: "Франция"
Gender: "Женский"
Experience: 2 года*/