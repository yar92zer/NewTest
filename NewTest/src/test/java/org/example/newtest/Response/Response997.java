package org.example.newtest.Response;

public class Response997 {
    public static boolean test997(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 23 && age <= 27
                && salary >= 28000 && salary <= 29000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Светлана"
Age: от 23 до 27
Salary: от 28000 руб до 29000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 7 лет*/