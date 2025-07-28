package org.example.newtest.Response;

public class Response546 {
    public static boolean test546(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 23 && age <= 27
                && salary >= 24000 && salary <= 36000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 23 до 27
Salary: от 24000 руб до 36000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 4 года*/