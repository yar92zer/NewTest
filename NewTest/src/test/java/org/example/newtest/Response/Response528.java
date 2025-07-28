package org.example.newtest.Response;

public class Response528 {
    public static boolean test528(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 26 && age <= 41
                && salary >= 38000 && salary <= 46000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 26 до 41
Salary: от 38000 руб до 46000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 2 года*/