package org.example.newtest.Response;

public class Response740 {
    public static boolean test740(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 19 && age <= 22
                && salary >= 52000 && salary <= 55000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Елизавета"
Age: от 19 до 22
Salary: от 52000 руб до 55000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 3 года*/