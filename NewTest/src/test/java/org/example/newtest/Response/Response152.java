package org.example.newtest.Response;

public class Response152 {
    public static boolean test152(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 33 && age <= 34
                && salary >= 28000 && salary <= 44000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 33 до 34
Salary: от 28000 руб до 44000 руб
Country: "Италия"
Gender: "Женский"
Experience: 5 лет*/