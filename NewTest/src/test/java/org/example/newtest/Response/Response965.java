package org.example.newtest.Response;

public class Response965 {
    public static boolean test965(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 22 && age <= 39
                && salary >= 54000 && salary <= 59000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Николай"
Age: от 22 до 39
Salary: от 54000 руб до 59000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/