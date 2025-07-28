package org.example.newtest.Response;

public class Response195 {
    public static boolean test195(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 21 && age <= 51
                && salary >= 28000 && salary <= 31000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 21 до 51
Salary: от 28000 руб до 31000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 2 года*/