package org.example.newtest.Response;

public class Response594 {
    public static boolean test594(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 20 && age <= 21
                && salary >= 36000 && salary <= 56000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 20 до 21
Salary: от 36000 руб до 56000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 3 года*/