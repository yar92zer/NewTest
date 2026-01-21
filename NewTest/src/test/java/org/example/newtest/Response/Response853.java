package org.example.newtest.Response;

public class Response853 {
    public static boolean test853(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 23 && age <= 24
                && salary >= 44000 && salary <= 53000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Иван"
Age: от 23 до 24
Salary: от 44000 руб до 53000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 4 года*/