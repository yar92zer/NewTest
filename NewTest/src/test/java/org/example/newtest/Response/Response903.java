package org.example.newtest.Response;

public class Response903 {
    public static boolean test903(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 30 && age <= 33
                && salary >= 24000 && salary <= 42000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Николай"
Age: от 30 до 33
Salary: от 24000 руб до 42000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 4 года*/