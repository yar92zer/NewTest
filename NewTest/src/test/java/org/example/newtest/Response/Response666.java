package org.example.newtest.Response;

public class Response666 {
    public static boolean test666(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 21 && age <= 32
                && salary >= 32000 && salary <= 33000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Максим"
Age: от 21 до 32
Salary: от 32000 руб до 33000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 2 года*/