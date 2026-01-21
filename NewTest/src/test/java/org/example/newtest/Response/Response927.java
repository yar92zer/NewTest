package org.example.newtest.Response;

public class Response927 {
    public static boolean test927(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 41 && age <= 51
                && salary >= 53000 && salary <= 65000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Андрей"
Age: от 41 до 51
Salary: от 53000 руб до 65000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 4 года*/