package org.example.newtest.Response;

public class Response105 {
    public static boolean test105(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 53 && age <= 58
                && salary >= 46000 && salary <= 61000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Жениский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 53 до 58
Salary: от 46000 руб до 61000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 13 лет*/