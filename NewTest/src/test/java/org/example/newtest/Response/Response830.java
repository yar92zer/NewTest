package org.example.newtest.Response;

public class Response830 {
    public static boolean test830(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 46 && age <= 48
                && salary >= 41000 && salary <= 51000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Оксана"
Age: от 46 до 48
Salary: от 41000 руб до 51000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 2 года*/