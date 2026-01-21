package org.example.newtest.Response;

public class Response692 {
    public static boolean test692(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Виктория")
                && age >= 23 && age <= 25
                && salary >= 35000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Виктория"
Age: от 23 до 25
Salary: от 35000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 4 года*/