package org.example.newtest.Response;

public class Response298 {
    public static boolean test298(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 30 && age <= 38
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 30 до 38
Salary: от 27000 руб до 29000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 3 года*/