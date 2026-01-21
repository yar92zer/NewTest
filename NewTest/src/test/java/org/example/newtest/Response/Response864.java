package org.example.newtest.Response;

public class Response864 {
    public static boolean test864(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 28 && age <= 29
                && salary >= 45000 && salary <= 49000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Николай"
Age: от 28 до 29
Salary: от 45000 руб до 49000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 7 лет*/