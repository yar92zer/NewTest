package org.example.newtest.Response;

public class Response646 {
    public static boolean test646(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 19 && age <= 23
                && salary >= 25000 && salary <= 46000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 19 до 23
Salary: от 25000 руб до 46000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 4 года*/