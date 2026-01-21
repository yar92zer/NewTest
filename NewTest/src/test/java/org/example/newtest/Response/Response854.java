package org.example.newtest.Response;

public class Response854 {
    public static boolean test854(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 22 && age <= 24
                && salary >= 27000 && salary <= 46000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Николай"
Age: от 22 до 24
Salary: от 27000 руб до 46000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 1 год*/