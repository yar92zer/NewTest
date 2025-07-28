package org.example.newtest.Response;

public class Response529 {
    public static boolean test529(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 28 && age <= 56
                && salary >= 54000 && salary <= 58000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 28 до 56
Salary: от 54000 руб до 58000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 15 лет*/