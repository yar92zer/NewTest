package org.example.newtest.Response;

public class Response739 {
    public static boolean test739(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 20 && age <= 21
                && salary >= 33000 && salary <= 52000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Николай"
Age: от 20 до 21
Salary: от 33000 руб до 52000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 2 года*/