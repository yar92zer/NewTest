package org.example.newtest.Response;

public class Response438 {
    public static boolean test438(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 27 && age <= 28
                && salary >= 33000 && salary <= 54000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 27 до 28
Salary: от 33000 руб до 54000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 3 года*/