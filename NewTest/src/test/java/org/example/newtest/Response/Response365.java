package org.example.newtest.Response;

public class Response365 {
    public static boolean test365(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 25 && age <= 46
                && salary >= 30000 && salary <= 32000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 25 до 46
Salary: от 30000 руб до 32000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 8 лет*/