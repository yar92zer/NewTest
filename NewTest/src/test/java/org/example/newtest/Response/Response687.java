package org.example.newtest.Response;

public class Response687 {
    public static boolean test687(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 26 && age <= 38
                && salary >= 35000 && salary <= 51000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Светлана"
Age: от 26 до 38
Salary: от 35000 руб до 51000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 15 лет*/