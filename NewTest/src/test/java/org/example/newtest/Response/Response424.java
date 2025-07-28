package org.example.newtest.Response;

public class Response424 {
    public static boolean test424(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 33 && age <= 36
                && salary >= 35000 && salary <= 39000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 33 до 36
Salary: от 35000 руб до 39000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 5 лет*/