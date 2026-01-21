package org.example.newtest.Response;

public class Response941 {
    public static boolean test941(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 29 && age <= 40
                && salary >= 39000 && salary <= 47000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Николай"
Age: от 29 до 40
Salary: от 39000 руб до 47000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 3 года*/