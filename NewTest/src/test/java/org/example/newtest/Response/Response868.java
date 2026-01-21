package org.example.newtest.Response;

public class Response868 {
    public static boolean test868(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 27 && age <= 31
                && salary >= 37000 && salary <= 54000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Михаил"
Age: от 27 до 31
Salary: от 37000 руб до 54000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 2 года*/