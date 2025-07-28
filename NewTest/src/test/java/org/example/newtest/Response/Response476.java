package org.example.newtest.Response;

public class Response476 {
    public static boolean test476(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 22 && age <= 24
                && salary >= 21000 && salary <= 35000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 22 до 24
Salary: от 21000 руб до 35000 руб
Country: "Германия"
Gender: "Женский"
Experience: 6 лет*/